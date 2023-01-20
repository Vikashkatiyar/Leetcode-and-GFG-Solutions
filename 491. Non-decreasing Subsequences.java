class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> set=new HashSet<List<Integer>>();
        List<Integer> list=new ArrayList<>();
        helper(nums,0,list,set);
        return new ArrayList<>(set);
    }

    public void helper(int []nums,int idx,List<Integer> list,Set<List<Integer>> set){
        if(list.size()>=2){
            set.add(new ArrayList<>(list));
        }

        for(int i=idx;i<nums.length;i++){
            if(list.isEmpty() || list.get(list.size()-1)<=nums[i]){
                list.add(nums[i]);
                helper(nums,i+1,list,set);
                list.remove(list.size()-1);
            }
        }
    }
}
