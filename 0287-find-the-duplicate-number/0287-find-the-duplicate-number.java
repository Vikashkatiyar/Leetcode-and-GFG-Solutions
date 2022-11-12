class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            nums[idx]=nums[idx]*-1;
            if(nums[idx]>0){
                return Math.abs(nums[i]);
            }
        }
         return 0;   
    }
}