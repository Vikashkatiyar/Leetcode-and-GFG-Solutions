class Solution {
    public int maxSubarraySumCircular(int[] nums) {
     int currMax=0,maxSum=nums[0];
     int currMin=0,minSum=nums[0];
    int totalSum=0;
     for(int num:nums){
        totalSum+=num;

        currMax=Math.max(currMax+num,num);
        maxSum=Math.max(currMax,maxSum);

        currMin=Math.min(currMin+num,num);
        minSum=Math.min(currMin,minSum);
     }

     return maxSum>0?Math.max(maxSum,totalSum-minSum):maxSum;

    }
}
