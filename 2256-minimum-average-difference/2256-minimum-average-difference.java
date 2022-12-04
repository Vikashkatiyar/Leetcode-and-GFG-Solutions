class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        long leftSum=0;
        long rightSum = 0;
        for(int nm:nums){
            rightSum+=nm;
        }
        
        int minAvg=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            leftSum+=nums[i];
            rightSum-=nums[i];
            
            int currDiff = (int)(Math.abs(leftSum / (i + 1) - rightSum / Math.max((n - (i + 1)), 1) ));
            if(currDiff<minAvg){
                minAvg=currDiff;
                ans=i;
            }
        }
        return ans;
    }
}