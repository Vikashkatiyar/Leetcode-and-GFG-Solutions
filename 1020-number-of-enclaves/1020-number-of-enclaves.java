class Solution {
    private static class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public int numEnclaves(int[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        LinkedList<Pair> q=new LinkedList<>();
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || j==0 || i==n-1 || j==m-1) &&(grid[i][j]==1)){
                    q.addLast(new Pair(i,j));
                    vis[i][j]=true;
                }
            }
        }
        
        while(q.size()>0){
            Pair rem=q.removeFirst();
            
            for(int i=0;i<4;i++){
                int rowD=rem.x+dir[i][0];
                int colD=rem.y+dir[i][1];
                
                if(rowD>=0 && colD>=0 && rowD<n && colD<m && grid[rowD][colD]==1 && vis[rowD][colD]==false){
                    q.addLast(new Pair(rowD,colD));
                    vis[rowD][colD]=true;
                    
                }
                
                
            }
        }
        
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==false){
                    count++;
                }
            }
        }
        
        return count;
    }
}