class Solution {
    
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
    public int shortestBridge(int[][] grid) {
        
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        LinkedList<Pair> q=new LinkedList<>();
        
        //Add first 1's iLand and marked that iLand
        boolean flag=false; //run only once this loop 
        for(int i=0;i<grid.length && flag==false;i++){
            for(int j=0;j<grid[0].length && flag==false;j++){
                if(grid[i][j]==1){
                    dfsMarked(grid,i,j,q,vis);
                    flag=true;
                }
                
            }
        }
        
        
        //Main LOgic
        int level=0;
        while(q.size()>0){
            int size=q.size();
            while(size-->0){
                Pair rem=q.removeFirst();
            
            for(int k=0;k<4;k++){
                int rowDash=rem.row+dir[k][0];
                int colDash=rem.col+dir[k][1];
                
                if(rowDash<0 || colDash<0 || rowDash>=grid.length || colDash>=grid[0].length || vis[rowDash][colDash]==true ){
                        continue;
                }
                 if(grid[rowDash][colDash]==1){
                     return level;
                 }
                 q.addLast(new Pair(rowDash,colDash));
                 vis[rowDash][colDash]=true;
                
              }
            }
            level++;
            
        }
        
        return level;
        
    }
    
    //this function is used for marking the first 1's iLand and add all the location of 1's in first iLand
    public void dfsMarked(int[][] grid,int row,int col,LinkedList<Pair> q,boolean[][] vis){
        vis[row][col]=true;
        q.addLast(new Pair(row,col));
        
        for(int i=0;i<4;i++){
            int rowDash=row+dir[i][0];
            int colDash=col+dir[i][1];
            
           
            
            if(rowDash<0 || colDash<0 || rowDash>=grid.length || colDash>=grid[0].length || vis[rowDash][colDash]==true || grid[rowDash][colDash]==0 ){
                continue;
            }
            dfsMarked(grid,rowDash,colDash,q,vis);
            
        }
       
    }
}