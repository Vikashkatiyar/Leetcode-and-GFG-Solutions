class Solution {
    // TC: O(V+E)+O(NlogN)
    //     SC: O(3N)
    public List<Integer> eventualSafeNodes(int[][] graph) {
        //using topo sort
        int n=graph.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] inDegree=new int[n];
        for(int i=0;i<n;i++){
            for(int it:graph[i]){
                adj.get(it).add(i);
                inDegree[i]++;
            }
        }
        
        Queue<Integer> q=new LinkedList<>();
        List<Integer> safeNode=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        
        while(!q.isEmpty()){
            int remNode=q.remove();
            safeNode.add(remNode);
            
            for(int it:adj.get(remNode)){
                inDegree[it]--;
                if(inDegree[it]==0){
                    q.add(it);
                }
            }
        }
        
        Collections.sort(safeNode);
        return safeNode;
    }
}