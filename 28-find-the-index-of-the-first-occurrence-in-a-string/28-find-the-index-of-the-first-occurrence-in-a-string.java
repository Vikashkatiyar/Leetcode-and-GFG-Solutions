class Solution {
    //using KMP Algorithum
    public int strStr(String txt, String pat) {
        int [] lps=getLPS(pat);
        int i=0;
        int j=0;
        while(i<txt.length()){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
                if(j==pat.length()){
                    return i-j;
                }
            }else if(j==0){
                i++;
            }else{
                j=lps[j-1];
            }
        }
        return -1;
    }
    public int[] getLPS(String pat){
        int[] lps=new int[pat.length()];
        int len=0;
        int i=1;
        while(i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len)){
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
        return lps;
    }
}