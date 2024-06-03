class Solution {
    public int appendCharacters(String s, String t) {
        int m=s.length();
        int n=t.length();
        
        
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        
        int i=0, j=0;
        while(i<m && j<n){
            if(s1[i]==t1[j]){
                i++;
                j++;
            }else{
                i++;
            }
        }
        
        return n-j;
    }
}