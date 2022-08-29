class Solution {
    public int numIslands(char[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    res++;
                    findOtherLand(grid,i,j);
                }
            }
        }
        return res;
    }
    
    private void findOtherLand(char [][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length|| j>=grid[i].length || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        findOtherLand(grid,i+1,j);
        findOtherLand(grid,i-1,j);
        findOtherLand(grid,i,j+1);
        findOtherLand(grid,i,j-1);

    }
}