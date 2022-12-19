class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //convert matrix to list
        
        ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            
            graph[u].add(v);
            graph[v].add(u);
        }
        
        boolean []visited=new boolean[n];
        return helper(graph,source,destination,visited);
    }
    
    
    
    // Has a path ?
    public boolean helper(ArrayList<Integer>[] graph,int src,int dest,boolean[] visited)
    {
        if(src==dest){
            return true;
        }
        visited[src]=true;
        for(int nbr:graph[src]){
            if(visited[nbr]==false){
                boolean hasNbrPath=helper(graph,nbr,dest,visited);
                if(hasNbrPath==true){
                    return true;
                }
            }
        }
        return false;
    }
}