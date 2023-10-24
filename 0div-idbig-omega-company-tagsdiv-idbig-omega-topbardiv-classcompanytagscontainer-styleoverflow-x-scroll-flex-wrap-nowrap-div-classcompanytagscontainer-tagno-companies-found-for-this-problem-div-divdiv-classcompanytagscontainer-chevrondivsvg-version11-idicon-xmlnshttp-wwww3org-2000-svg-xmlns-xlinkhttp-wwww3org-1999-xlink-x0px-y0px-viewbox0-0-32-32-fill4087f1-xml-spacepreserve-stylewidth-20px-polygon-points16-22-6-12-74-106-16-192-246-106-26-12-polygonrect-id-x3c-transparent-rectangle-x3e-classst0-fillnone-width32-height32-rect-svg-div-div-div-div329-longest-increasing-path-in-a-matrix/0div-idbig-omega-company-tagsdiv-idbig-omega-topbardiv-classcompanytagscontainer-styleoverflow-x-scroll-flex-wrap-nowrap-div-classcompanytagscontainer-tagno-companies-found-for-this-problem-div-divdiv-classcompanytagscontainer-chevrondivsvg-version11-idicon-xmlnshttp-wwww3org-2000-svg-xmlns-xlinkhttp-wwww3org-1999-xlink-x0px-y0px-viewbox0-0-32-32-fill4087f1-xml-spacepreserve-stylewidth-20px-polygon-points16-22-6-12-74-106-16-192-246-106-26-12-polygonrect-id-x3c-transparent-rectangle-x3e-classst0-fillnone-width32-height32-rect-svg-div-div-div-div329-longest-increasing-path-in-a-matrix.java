class Solution {
    int dx[]={1,0,-1,0};
    int dy[]={0,1,0,-1};
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int[m][n];
        
        int maxLen=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count=dfs(i,j,m,n ,matrix, dp);
                maxLen=Math.max(count, maxLen);
            }
        }
        return maxLen;
    }
    public int dfs(int i, int j, int m, int n, int[][] matrix, int[][] dp){
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        
        int ans=1;
        for(int k=0;k<4;k++){
            int nRow=i+dx[k];
            int nCol=j+dy[k];
            
            if(nRow>= m || nCol>= n|| nRow<0 || nCol<0 ){
                continue;
            }
            if(matrix[i][j] >= matrix[nRow][nCol]){
                continue;
            }
            ans=Math.max(ans,1+dfs(nRow,nCol,m,n, matrix, dp));
        }
        dp[i][j]=ans;
        return ans;
    }
}