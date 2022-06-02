class Solution {
    public int minPathSum(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int dp[][]=new int[n][m];

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i+1<n && j+1<m ){
                    dp[i][j]=arr[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
                }
                else if(i==n-1 && j==m-1){
                    dp[i][j]=arr[i][j];
                }
                else if(j==m-1){
                    dp[i][j]=arr[i][j]+dp[i+1][j];

                }
                else if(i==n-1){
                    dp[i][j]=arr[i][j]+dp[i][j+1];

                }
               
            }
        }
         return dp[0][0];
    }
}