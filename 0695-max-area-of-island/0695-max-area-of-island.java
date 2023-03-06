class Solution {
    int max=0;
    int tempMax=0;
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    tempMax=0;
                    traverse(grid,i,j);
                }
            }
        }
        return max;
    }

    public void traverse(int[][] grid,int row, int col){
      if(row<0 || col<0 || row>=grid.length || col>=grid[0].length|| grid[row][col]==0){
          return ;
      }
      tempMax++;
      grid[row][col]=0;

      int[] dX={-1,0,1,0};
      int[] dY={0,1,0,-1};
      for(int i=0;i<4;i++){
          traverse(grid,row+dX[i],col+dY[i]);
      }
      max=Math.max(max,tempMax);
    }
}