class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }
       
        //convert Adjacency Matrix to Adjacency List
         List<List<Integer>> adjList=buildGraph(n,connections);
         
        
        boolean[] vis=new boolean[n];
        int noOfComponenet=0;
        
         //traverse all the vertices of graph
        for(int v=0;v<n;v++){
            if(vis[v]==false){
                getComponenet(adjList,v,vis);
                noOfComponenet++;
            }
        }
        
        return noOfComponenet-1;
        
    }
    
    private void getComponenet(List<List<Integer>> graph,int src,boolean[] vis){
        vis[src]=true;
        for(int nbr:graph.get(src)){
            if(vis[nbr]==false){
                getComponenet(graph,nbr,vis);
            }
        }
    }
    
    private List<List<Integer>> buildGraph(int n,int[][] connections){
        
        List<List<Integer>> adjList=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int [] connection:connections){
            adjList.get(connection[0]).add(connection[1]);
            adjList.get(connection[1]).add(connection[0]);
        }
        
        return adjList;
    }
}