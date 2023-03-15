class Solution {
    public int findCircleNum(int[][] arr) {
        int n=arr.length;
        ArrayList<ArrayList<Integer>> adjList=buildgraph(arr.length,arr);
        
        boolean[] vis=new boolean[n];
        int noOfComp=0;
        
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                getComponenet(adjList,i,vis);
                noOfComp++;
            }
        }
        
        return noOfComp;
    }
    
    public ArrayList<ArrayList<Integer>> buildgraph(int n,int[][] connections){
        
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int i=0;i<connections.length;i++){
             
            for(int j=0;j<connections[i].length;j++){
                if(connections[i][j]==1){
                    adjList.get(i).add(j);
                    
                }
            }
        }
        return adjList;
    }
    
    public void getComponenet(ArrayList<ArrayList<Integer>> graph,int src,boolean[] vis){
         vis[src]=true;
        for(int nbr:graph.get(src)){
            if(vis[nbr]==false){
                getComponenet(graph,nbr,vis);
            }
        }
    }
}