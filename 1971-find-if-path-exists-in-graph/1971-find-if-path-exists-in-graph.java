class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
     //Convert Matrix to List
        
        ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        
        boolean[] vis=new boolean[n];
        return hasPath(graph,source,destination,vis);
    }
    
    public boolean hasPath(ArrayList<Integer>[] graph,int src,int dest,boolean[] vis){
        if(src==dest){
            return true;
        }
        
        vis[src]=true;
        for(int nbr:graph[src]){
            if(vis[nbr]==false){
                boolean hasNbrPath=hasPath(graph,nbr,dest,vis);
                if(hasNbrPath==true){
                    return true;
                }
            }
        }
        
        return false;
    }
}