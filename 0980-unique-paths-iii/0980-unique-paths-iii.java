class Solution {
    public int uniquePathsIII(int[][] grid) {
        int zero=0;
        int srcx=0,srcy=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){ // count the number of zeros 
                    zero++;
                }
                if(grid[i][j]==1){ //finding the source location
                    srcx=i;
                    srcy=j;
                }
            }
        }
        return dfs(grid,srcx,srcy,zero);
    }
    private int dfs(int [][] grid,int x,int y,int zero){
        //check the condition for index out of bound
        if(x>=grid.length || y>=grid[0].length || x<0 || y<0 || grid[x][y]==-1){
            return 0;
        }
        
        if(grid[x][y]==2){  //destination achived
            return (zero==-1)?1:0;
        }
        
        grid[x][y]=-1; //mark visited
        zero--;  
        
        int totalPath=dfs(grid,x+1,y,zero)+ // Explore all path make the answer
                      dfs(grid,x,y+1,zero)+
                      dfs(grid,x-1,y,zero)+
                      dfs(grid,x,y-1,zero);
        
        grid[x][y]=0; // mark unvisite
        zero++;
        
        return totalPath;
        
    }
}