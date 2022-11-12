class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double> set=new HashSet<>();
        
        int left=0;
        int right=nums.length-1;
        
       for(int i=0;i<nums.length/2;i++){
            set.add((nums[i]+nums[nums.length-i-1])/2.0);
        }
        
        return set.size();
        
        
        
    }
}