class Solution {
    // public int uniquePaths(int m, int n) {
    //     int [][]dp=new int [m][n];
    //     for(int i=m-1;i>=0;i--){
    //         for(int j=n-1;j>=0;j--){
    //             if(i==m-1 || j==n-1){
    //                 dp[i][j]=1;
    //             }
    //             else{
    //                 dp[i][j]=dp[i+1][j]+dp[i][j+1];
    //             }
    //         }
    //     }
    //     return dp[0][0];
    // }
    
    
    public int uniquePaths(int m, int n) {
        int[][]dp = new int[m][n];
       int i = 0, j =0;
        return allUniquePaths(i , j , dp);
    }
    public int allUniquePaths(int i , int j , int[][]dp){
        int m=dp.length;
        int n=dp[0].length;
        if(i == m-1 && j == n-1) return 1;
        if(i > m-1 || j > n-1) return 0;
        if(dp[i][j] != 0) return dp[i][j];
        int right = allUniquePaths(i , j+1 , dp);
        int down = allUniquePaths(i+1 , j , dp);
        return dp[i][j] = right + down;
    }
}