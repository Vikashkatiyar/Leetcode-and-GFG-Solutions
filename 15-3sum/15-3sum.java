class Solution {
    //TC:O(n2);-> do further optimize
    //SC:O(n);
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int target=-nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==target){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                }else if(nums[j]+nums[k]>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}