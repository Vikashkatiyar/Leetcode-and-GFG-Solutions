class Solution {
    public int numEnclaves(int[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(i == 0 || j == 0 || i == grid.length-1 || j == grid[0].length-1 && grid[i][j] == 1){
                    mark(grid, i, j);
                }
            }
        }
        int count = 0;
        for(int i=1; i<grid.length-1; i++){
            for(int j=1; j<grid[0].length-1; j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
    private void mark(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i > grid.length-1 || j > grid[0].length-1 || grid[i][j] == 0)    
        {
             return;
        }
        grid[i][j] = 0;
        mark(grid, i+1, j);
        mark(grid, i, j+1);
        mark(grid, i-1, j);
        mark(grid, i, j-1);
    }
}
