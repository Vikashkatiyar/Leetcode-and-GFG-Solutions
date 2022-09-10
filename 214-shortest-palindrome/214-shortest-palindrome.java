class Solution {
    //LPS From KMP Algorithum
    public String shortestPalindrome(String s) {
        String str=s+"$"+new StringBuilder(s).reverse().toString();
        int[] lps=new int[str.length()];
        
        int len=0;
        int i=1;
        while(i<str.length()){
            if(str.charAt(i)==str.charAt(len)){
                lps[i]=len+1;
                len++;
                i++;
            }else if(len>0){
                len=lps[len-1];
            }else{
                lps[i]=0;
                len=0;
                i++;
            }
        }
        int palindromeprefixLength=lps[str.length()-1];
        String rightString=s.substring(palindromeprefixLength);
        return new StringBuilder(rightString).reverse().toString()+s;
        
    }
}