class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        
        long currSum=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            currSum+=nums[i];
            if(currSum>=totalSum-currSum){
                count++;
            }
        }
        return count;
    }
}