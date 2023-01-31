class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations=new ArrayList<>();
        List<Integer> combination=new ArrayList<>();
        helper(combinations,combination,0,n,k);
        return combinations;
    }
    public void helper(List<List<Integer>> combinations,List<Integer> combination,int currBox,int n,int k){
        if(currBox==n){
            if(combination.size()==k){
                combinations.add(new ArrayList<>(combination));
                
            }
            return;
        }

        combination.add(currBox+1);
        helper(combinations,combination,currBox+1, n, k);
        combination.remove(combination.size()-1);

        helper(combinations,combination,currBox+1, n, k);
    }

}
