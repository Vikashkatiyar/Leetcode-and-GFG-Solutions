class Solution {
    int max=0;
    public int getMaximumGold(int[][] grid) {
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    dfs(grid,i,j,0);
                }
            }
        }
        
        return max;
    }
    
    public void dfs(int[][] grid,int i,int j,int currSum){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            max=Math.max(currSum,max);
            return;
        }
        int val=grid[i][j];
        grid[i][j]=0;
        dfs(grid,i-1,j,currSum+val);
        dfs(grid,i,j-1,currSum+val);
        dfs(grid,i+1,j,currSum+val);
        dfs(grid,i,j+1,currSum+val);
        grid[i][j]=val;
    }
}