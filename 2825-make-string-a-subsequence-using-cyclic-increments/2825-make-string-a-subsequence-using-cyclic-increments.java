class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int i=0,j=0;
        
        while(i<n && j<m){
            
            
            if((str2.charAt(j)-str1.charAt(i)+26) %26  <= 1){
                // or
               //if(b==a || (b=='a' && a=='z' ) || a+1==b)
                j++;
            }

            i++;
        }
        return j==m;
    }
}