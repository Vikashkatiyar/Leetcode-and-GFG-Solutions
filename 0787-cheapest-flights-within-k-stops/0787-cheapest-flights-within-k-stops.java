class Solution {
    class Pair{
        int src;
        int dist;
        Pair(int src,int dist){
            this.src=src;
            this.dist=dist;
        }
    }
    
    class Tuple{
        int stops;
        int src;
        int dist;
        Tuple(int stops,int src,int dist){
            this.stops=stops;
            this.src=src;
            this.dist=dist;
        }
    }
    
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adjList=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        
        int m=flights.length;
        for(int i=0;i<m;i++)
        {
            adjList.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        
        //Simple BFS
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(0,src,0));
        
        int [] diff=new int[n];
        Arrays.fill(diff,Integer.MAX_VALUE);
        diff[src]=0;
        
        while(q.size()>0){
            Tuple rem=q.remove();
            int remStops=rem.stops;
            int remSrc=rem.src;
            int remDiff=rem.dist;
            
            if(remStops>k){
                continue;
            }
            
            for(Pair p:adjList.get(remSrc)){
                if(p.dist+remDiff< diff[p.src] && remStops<=k){
                    diff[p.src]=p.dist+remDiff;
                    q.add(new Tuple(remStops+1,p.src,p.dist+remDiff));
                }
            }
            
        }
        
        
        return diff[dst]==Integer.MAX_VALUE?-1:diff[dst];
    }
}