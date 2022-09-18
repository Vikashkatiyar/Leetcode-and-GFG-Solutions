class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
         int count = 1;
        int maxCount = 1;
       for(int i=1; i<nums.length; i++){
            
            if(nums[i]  != nums[i - 1]){
                if(nums[i] == nums[i-1] + 1){
                    count++;    
                }else{
                    maxCount = Math.max(count, maxCount);
                    count = 1;
                }
            }
            
        }
         return Math.max(maxCount, count);
    }
}