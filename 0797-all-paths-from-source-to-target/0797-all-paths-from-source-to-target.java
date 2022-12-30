class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        int startIndex=0;
        int endIndex=graph.length-1;
        
        Queue<List<Integer>> q=new LinkedList<>();
        q.add(Arrays.asList(startIndex));
        
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                List<Integer> headList=q.poll();
                int lastNode=headList.get(headList.size()-1);
                
                if(lastNode==endIndex){
                    ans.add(headList);
                }
                
                for(int nbr:graph[lastNode]){
                    List<Integer> copyList=new ArrayList<>(headList);
                    copyList.add(nbr);
                    q.add(copyList);
                }
            }
        }
        return ans;
    }
}