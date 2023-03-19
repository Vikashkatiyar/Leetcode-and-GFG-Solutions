class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int maxDistance(int[][] grid) {
        
        //add all 1's firstly then traverse Radius/levelWise
        LinkedList<Pair> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    q.addLast(new Pair(i,j));
                }
            }
        }
        
        if(q.size()==grid.length*grid[0].length || q.size()==0){
            return -1;
        }
        //main Logic BFS
        
        int level=-1;
        int [][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        while(q.size()>0){
            int size=q.size();
            level++;
            
            while(size-->0){
                Pair rem=q.removeFirst();
                
                for(int i=0;i<4;i++){
                    int rowDash=rem.row+dir[i][0];
                    int colDash=rem.col+dir[i][1];
                    
                    if(rowDash>=0 && colDash>=0 && rowDash<grid.length && colDash<grid[0].length && grid[rowDash][colDash]==0){
                        q.addLast(new Pair(rowDash,colDash));
                        grid[rowDash][colDash]=1;
                    }
                }
            }
        }
        
        return level;
    }
}