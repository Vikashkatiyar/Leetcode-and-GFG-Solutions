class Solution {
    public int uniquePaths(int m, int n) {
        return helper(0,0,m,n,new int[m][n]);
    }
    
    public int helper(int sr,int sc,int dr,int dc,int[][] dp){
        if(sr==dr-1 && sc==dc-1){
            return 1;
        }
        
        if(sr>dr-1 || sc>dc-1){
            return 0;
        }
        
        if(dp[sr][sc]!=0){
            return dp[sr][sc];
        }
        
        int down=helper(sr+1,sc,dr,dc,dp);
        int right=helper(sr,sc+1,dr,dc,dp);
        
        return dp[sr][sc]=down+right;
        
    }
}