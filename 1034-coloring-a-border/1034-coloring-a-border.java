class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        //for marking the negative 
        helperDfs(grid,row,col,grid[row][col]);
        
        //puttting then color in right location
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    grid[i][j]=color;
                }
            }
        }
        
        
        return grid;
        
    }
    
    int [][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public void helperDfs(int[][] grid,int row,int col,int clr){
        //aate hi mark kaaro
        grid[row][col]=-clr;
        
        int count=0;
        
        
        for(int i=0;i<4;i++){
            int rowDash=row+dir[i][0];
            int colDash=col+dir[i][1];
            
            //agar matrix se bahar , grid value is not eqal to color value then continue karo
            if(rowDash<0 || colDash<0 || rowDash>=grid.length || colDash>=grid[0].length || Math.abs(grid[rowDash][colDash])!=clr){
                continue;
            }
            
            
            //grid value is equal to color value then go for that
            count++;
            if(grid[rowDash][colDash]==clr){
                helperDfs(grid,rowDash,colDash,clr);
            }
        }
        
        
        //Agar four dir me bhi same color h too change maat karo
        if(count==4){
            grid[row][col]=clr;
        }
        
    }
}