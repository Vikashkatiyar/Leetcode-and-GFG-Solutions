class Solution {
    
    /*
      1.aCyclic-> Bipertite
      2. Cyclic-> even size()-> Bipertite
                 odd Size() -> Not Bipertite
    
    */
        class Pair{
           int v;
           int level;

           Pair(int v ,int level){
               this.v=v;//for vertex
               this.level=level;
           }
       }
    public boolean isBipartite(int[][] graph) {
        
        //make adjList
         int n=graph.length;
         ArrayList<Integer>[] adjList=new ArrayList[n];
        
         for(int i=0;i<graph.length;i++){
             adjList[i]=new ArrayList<>();
         }
        
         
         for(int i=0;i<graph.length;i++){
             for(int j=0;j<graph[i].length;j++){
                 adjList[i].add(graph[i][j]);
             }
         }
        
        
        
        //logic to check Bipertite
        int []vis=new int[n];
        Arrays.fill(vis,-1);
        
        
        for(int v=0;v<n;v++){
            if(vis[v]==-1){
                boolean visit=checkBiperpiteness(adjList,v,vis);
                if(visit==false){
                    return false;
                }
            }
        }
        return true;
      
    }
    
    public boolean checkBiperpiteness(ArrayList<Integer>[] graph,int src,int[] vis){
        ArrayDeque<Pair> q=new ArrayDeque<>();
        q.add(new Pair(src,0));
        
        // r m* w ad*
        
        while(q.size()>0){
            //remove
            Pair rem=q.remove();
            
            
            //mark*
            if(vis[rem.v]!=-1){
                if(vis[rem.v]!=rem.level){
                    return false;
                }
            }else{
                vis[rem.v]=rem.level;
            }
            
            
            
            //add neigh*
            for(Integer e:graph[rem.v]){
                if(vis[e]==-1){
                    q.add(new Pair(e,rem.level+1));
                }
            }
            
        }
        
        return true;
        
    }
    
    
}




