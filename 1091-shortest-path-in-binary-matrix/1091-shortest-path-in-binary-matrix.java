class Solution {
    class Triple{
        int node1;
        int node2;
        int wt;
        Triple(int node1,int node2,int wt){
            this.node1=node1;
            this.node2=node2;
            this.wt=wt;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]!=0){
            return -1;
        }
        int n=grid.length;
        int [] source={0,0};
        int []destination={n-1,n-1};
        
        return shortestPath(grid,source,destination);
        
        
    }
    int shortestPath(int[][] grid, int[] source, int[] destination) {
          
          if(source[0]==destination[0] && source[1]==destination[1]){
              return 1;
          }
          
          int n=grid.length;
          int m=grid[0].length;
          
          
          //Make a dist array same as Dijkstra
          int[][] dist=new int[n][m];
          for(int i=0;i<n;i++){
              for(int j=0;j<m;j++){
                  dist[i][j]=Integer.MAX_VALUE;
              }
          }
          
          //Here WE apply Dijktra but nor PriorityQueue becoz here wt is in incresing order+1
          // if we want then use priority Queue but avoid use O(logn) extra
          
          Queue<Triple> q=new LinkedList<>();
          q.add(new Triple(source[0],source[1],1));
          
          dist[0][0]=1;
          int delRow[]={0,1,0,-1,1,-1,-1,1};
          int delCol[]={1,0,-1,0,1,-1,1,-1};
          
          while(q.size()>0){
              Triple rem=q.remove();
              
              int r=rem.node1;
              int c=rem.node2;
              int dis=rem.wt;
              
              for(int i=0;i<8;i++){
                  int nRow=r+delRow[i];
                  int nCol=c+delCol[i];
                  
                  if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && grid[nRow][nCol]==0 && dis+1<dist[nRow][nCol]){
                      dist[nRow][nCol]=dis+1;
                      if(nRow==destination[0] && nCol==destination[1]){
                          return dis+1;
                      }
                      q.add(new Triple(nRow,nCol,dis+1));
                  }
              }
          }
          
          return -1;
    }
}