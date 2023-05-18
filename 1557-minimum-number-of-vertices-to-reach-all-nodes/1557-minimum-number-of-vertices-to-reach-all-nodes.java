class Solution {
    //Jai Baba Bhole
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        //We only have to count the number of nodes with zero incoming edges.
        int[] inDegree=new int[n];
        for(List<Integer>edge: edges){
            inDegree[edge.get(1)]++;
        }
        
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(inDegree[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}