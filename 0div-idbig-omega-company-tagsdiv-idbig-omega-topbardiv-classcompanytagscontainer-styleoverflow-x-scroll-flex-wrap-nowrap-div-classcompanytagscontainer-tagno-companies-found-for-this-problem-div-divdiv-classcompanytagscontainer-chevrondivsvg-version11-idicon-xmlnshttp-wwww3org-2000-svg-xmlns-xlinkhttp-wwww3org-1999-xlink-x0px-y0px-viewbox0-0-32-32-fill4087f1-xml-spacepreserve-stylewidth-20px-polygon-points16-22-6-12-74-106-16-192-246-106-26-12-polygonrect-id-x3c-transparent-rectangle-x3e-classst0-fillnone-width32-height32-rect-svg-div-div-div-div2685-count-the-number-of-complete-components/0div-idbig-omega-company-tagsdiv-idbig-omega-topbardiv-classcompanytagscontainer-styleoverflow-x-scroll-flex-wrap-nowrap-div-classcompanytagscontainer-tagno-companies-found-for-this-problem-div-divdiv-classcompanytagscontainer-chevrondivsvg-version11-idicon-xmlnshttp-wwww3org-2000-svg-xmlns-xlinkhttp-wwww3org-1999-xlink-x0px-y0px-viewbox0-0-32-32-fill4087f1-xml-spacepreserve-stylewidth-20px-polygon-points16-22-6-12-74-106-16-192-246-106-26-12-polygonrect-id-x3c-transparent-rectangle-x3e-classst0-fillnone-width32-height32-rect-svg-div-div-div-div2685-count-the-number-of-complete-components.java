class Solution {
    int v=0;
    int e=0;
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adjList=new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int[] edge: edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(adjList, i, vis);
                if(e/2==v*(v-1)/2){
                    count++;
                }
            }
            e=v=0;
        }
        return count;
    }
    
    public void dfs(List<List<Integer>> adjList, int from, boolean[] vis){
        vis[from]=true;
        v++;
        for(int nbr: adjList.get(from)){
            e++;
            if(!vis[nbr]){
                dfs(adjList, nbr, vis);
            }
        }
    }
}