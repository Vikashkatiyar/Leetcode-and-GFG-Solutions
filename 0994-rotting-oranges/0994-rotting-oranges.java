class Solution {
    
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int orangesRotting(int[][] grid) {
        //traverse Radius/levelWise 
        
        LinkedList<Pair> q=new LinkedList<>();
        int fresh=0;
        
        //add first all Rotten Oranges in Q
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.addLast(new Pair(i,j));
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        
        if(fresh==0){
            return 0;
        }
        
        
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        int level=-1;
        
        //Main Logic
        while(q.size()>0){
            int size=q.size();
            level++;
            
            while(size-->0){
                Pair rem=q.removeFirst();
                
                for(int i=0;i<4;i++){
                    int rowDash=rem.row+dir[i][0];
                    int colDash=rem.col+dir[i][1];
                    
                    if(rowDash>=0 && colDash>=0 && rowDash<grid.length && colDash<grid[0].length && grid[rowDash][colDash]==1){
                        
                        q.add(new Pair(rowDash,colDash)); //add
                        grid[rowDash][colDash]=0; //mark
                        fresh--;
                        
                    }
                }
            }
        }
        
        if(fresh==0){
            return level;
        }else{
            return -1;
        }
        
        
    }
}