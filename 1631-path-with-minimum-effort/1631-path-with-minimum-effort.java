class Solution {
    //jai bhole 
    //Dijkta 
    class Triple{
        int row;
        int col;
        int diff;
        Triple(int row,int col,int diff){
            this.row=row;
            this.col=col;
            this.diff=diff;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        
        PriorityQueue<Triple> pq=new PriorityQueue<>((a,b)-> a.diff-b.diff);
        pq.add(new Triple(0,0,0));
        dist[0][0]=0;
        
        int [] dr={-1,0,1,0};
        int [] dc={0,+1,0,-1};
        while(pq.size()>0){
            Triple rem=pq.remove();
            
            int remRow=rem.row;
            int remCol=rem.col;
            int remDiff=rem.diff;
            
            if(remRow==n-1 && remCol==m-1){
                return remDiff;
            }
            
            
            for(int i=0;i<4;i++){
                int newRow=remRow+dr[i];
                int newCol=remCol+dc[i];
                
                if(newRow>=0 && newRow<n && newCol>=0 && newCol<m){
                    int newDiff=Math.max(Math.abs(heights[remRow][remCol]-heights[newRow][newCol]),remDiff);
                    
                    if(newDiff<dist[newRow][newCol]){
                        dist[newRow][newCol]=newDiff;
                        pq.add(new Triple(newRow,newCol,newDiff));
                    }
                }
            }
        }
        return 0;
    }
}