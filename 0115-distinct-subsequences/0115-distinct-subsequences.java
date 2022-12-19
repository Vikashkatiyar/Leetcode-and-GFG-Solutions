class Solution {
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[][] dp=new int[m+1][n+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                }else if(i==0){
                    dp[i][j]=1;
                }else if(j==0){
                    dp[i][j]=0;
                }else if(t.charAt(i-1)==s.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+dp[i][j-1];
                }else{
                    dp[i][j]=dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }
}