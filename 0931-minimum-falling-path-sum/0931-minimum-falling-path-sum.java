class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int [][]dp=new int[matrix.length][matrix.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0){
                    dp[i][j]=matrix[i][j];
                }
                else if(j==0){
                    dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j],dp[i-1][j+1]);
                }
                else if(j==dp.length-1){
                    dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j-1],dp[i-1][j]);
                }
                else{
                    dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i-1][j+1]));
                }
            }
        }
        
        int res=Integer.MAX_VALUE;
        for(int i=0;i<dp.length;i++){
            res=Math.min(res,dp[n-1][i]);
        }
        return res;
    }
}