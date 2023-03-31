class Solution {
    //Jai Bhole
    
    //modified Dijktra
    class Triple implements Comparable<Triple>{
        int row;
        int col;
        int msf;
        
        Triple(int row,int col,int msf){
            this.row=row;
            this.col=col;
            this.msf=msf;
        }
        
        public int compareTo(Triple o){
            return this.msf-o.msf;
        }
    }
    
    
    
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        PriorityQueue<Triple> pq=new PriorityQueue<>();
        pq.add(new Triple(0,0,grid[0][0]));
        
        boolean[][] vis=new boolean[n][n];
        int[][] dirs={{1,0},{0,1},{-1,0},{0,-1}};
        
        while(pq.size()>0){
            Triple rem=pq.remove();
            
            //if reach the last index finnaly over
            if(rem.row==n-1 && rem.col==n-1){
                return rem.msf;
            }
            
            //if alredy vis then donot process them again
            if(vis[rem.row][rem.col]==true){
                continue;
            }
            
            vis[rem.row][rem.col]=true;
            
            for(int i=0;i<4;i++){
                int rowDash=rem.row+dirs[i][0];
                int colDash=rem.col+dirs[i][1];
                
                if(rowDash<0 || colDash<0 || rowDash>=n || colDash>=n || vis[rowDash][colDash]==true){
                    continue;
                }
                
                pq.add(new Triple(rowDash,colDash,Math.max(rem.msf,grid[rowDash][colDash])));
            }
        }
        
        return 0;
    }
}