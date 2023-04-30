class Solution {
    int maxFish=0;
    public int findMaxFish(int[][] grid) {
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                    maxFish=Math.max(maxFish,helper(grid,i,j));
                }
            }
        }
        return maxFish;
    }
    
    public int helper(int[][] grid,int row,int col){
        
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
            return 0;
        }
        
        int sum=grid[row][col];
        
        grid[row][col]=0;
        sum+=helper(grid,row,col+1);
        sum+=helper(grid,row,col-1);
        sum+=helper(grid,row+1,col);
        sum+=helper(grid,row-1,col);
        
        return sum;
    }
}