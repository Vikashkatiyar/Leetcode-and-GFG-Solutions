class Solution {
    //Jai Shree Ram
    public int[] restoreArray(int[][] adjacentPairs) {
        // Design Adjacency List
        Map<Integer, List<Integer>> map=new HashMap<>();
        
        for(int[] adj: adjacentPairs){
            map.putIfAbsent(adj[0],new ArrayList<>());
            map.putIfAbsent(adj[1], new ArrayList<>());
            
            map.get(adj[0]).add(adj[1]);
            map.get(adj[1]).add(adj[0]);
        }
        
        //finding the start node
        int start=0;
        for(int key : map.keySet()){
            if(map.get(key).size()==1){
                start=key;
                break;
            }
        }
        
        //Make DFS call
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        dfs(start, map, list, set);
        
        //convert list to array
        int []res=new int[adjacentPairs.length+1];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        
        return res;
    }
     
    // fill all pairs
    public void dfs(int start, Map<Integer, List<Integer>> map, List<Integer> list, Set<Integer> set){
        list.add(start);
        set.add(start);
        for(int nbr: map.get(start)){
            if(set.contains(nbr)==false){
                dfs(nbr, map, list, set);
            }
        }
    }
}