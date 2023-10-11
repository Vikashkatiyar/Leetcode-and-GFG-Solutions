class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] degree=new int[n];
        boolean[][] connect=new boolean[n][n]; //used for checking the repeated edge 
        //between 
        
        for(int[] road: roads){
            int u=road[0];
            int v=road[1];
            
            degree[u]++;
            degree[v]++;
            
            connect[u][v]=true;
            connect[v][u]=true;
        }
        
        int maxRank=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int i_rank=degree[i];
                int j_rank=degree[j];
                
                int rank=i_rank+j_rank;
                if(connect[i][j]){
                    rank=rank-1;
                }
                
                maxRank=Math.max(maxRank, rank);
            }
        }
        
        return maxRank;
    }
}