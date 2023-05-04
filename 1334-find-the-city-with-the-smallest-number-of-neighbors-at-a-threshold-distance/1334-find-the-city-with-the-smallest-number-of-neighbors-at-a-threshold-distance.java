class Solution {
    //Jai Baba Bhole
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=Integer.MAX_VALUE;
                
            }
        }
        
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            
            dist[v][u]=wt;
            dist[u][v]=wt;
        }
        
        for(int i=0;i<n;i++){
            dist[i][i]=0;
        }
        
        for(int via=0;via<n;via++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][via]==Integer.MAX_VALUE || dist[via][j]==Integer.MAX_VALUE){
                        continue;
                    }
                    dist[i][j]=Math.min(dist[i][j],dist[i][via]+dist[via][j]);
                }
            }
        }
        
        int maxCount=n;
        int ans=-1;
        for(int city=0;city<n;city++){
            int count=0;
            for(int adcity=0;adcity<n;adcity++){
                if(dist[city][adcity]<=distanceThreshold){
                    count++;
                }
                    
            }
            
            if(count<=maxCount){
                maxCount=count;
                ans=city;
            }
        }
        
        return ans;
    }
}