class Solution {
    //first solve rotten oranges 
    public int[][] highestPeak(int[][] isWater) {
        int m=isWater.length;
        int n=isWater[0].length;
        
        int[][] heights=new int[m][n];
        Queue<int[]> q=new LinkedList<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j]==1){
                    q.add(new int[]{i,j});
                }
            }
        }
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        while(!q.isEmpty()){
            int[] rem=q.poll();
            int row=rem[0], col=rem[1];
            
            for(int i=0;i<4;i++){
                int adjR=row+dx[i], adjC=col+dy[i];
                
                if(adjR>=0 && adjC>=0 && adjR<m && adjC<n && isWater[adjR][adjC]==0){
                    heights[adjR][adjC]=heights[row][col]+ 1;
                    isWater[adjR][adjC]=1;
                    q.add(new int[]{adjR, adjC});
                }
            }
        }
        
        return heights;
    }
}