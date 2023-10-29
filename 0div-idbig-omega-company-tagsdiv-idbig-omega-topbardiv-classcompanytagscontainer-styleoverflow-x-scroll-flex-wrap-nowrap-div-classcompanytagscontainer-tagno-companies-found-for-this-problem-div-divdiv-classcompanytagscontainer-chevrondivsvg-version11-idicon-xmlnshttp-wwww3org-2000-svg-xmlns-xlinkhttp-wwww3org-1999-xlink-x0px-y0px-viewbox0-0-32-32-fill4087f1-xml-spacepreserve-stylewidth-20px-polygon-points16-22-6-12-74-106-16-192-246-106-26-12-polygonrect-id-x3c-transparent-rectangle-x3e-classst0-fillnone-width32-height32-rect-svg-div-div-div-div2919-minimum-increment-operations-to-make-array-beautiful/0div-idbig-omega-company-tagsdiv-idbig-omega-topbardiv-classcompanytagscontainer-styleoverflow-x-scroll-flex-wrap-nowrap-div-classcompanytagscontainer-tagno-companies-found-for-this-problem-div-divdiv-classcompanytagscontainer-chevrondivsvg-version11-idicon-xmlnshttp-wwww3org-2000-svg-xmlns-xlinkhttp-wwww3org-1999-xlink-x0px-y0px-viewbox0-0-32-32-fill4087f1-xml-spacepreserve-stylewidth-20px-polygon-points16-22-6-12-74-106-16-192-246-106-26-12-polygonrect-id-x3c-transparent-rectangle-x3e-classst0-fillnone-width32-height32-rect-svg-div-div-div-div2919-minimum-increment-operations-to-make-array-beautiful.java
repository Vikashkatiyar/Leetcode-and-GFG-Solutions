class Solution {
    public long minIncrementOperations(int[] nums, int k) {
        long dp1=0,dp2=0,dp3=0,dp;
        
        for(int num:nums){
            dp=Math.min(dp1,Math.min(dp2,dp3))+Math.max(k-num,0);
            
            dp1=dp2;
            dp2=dp3;
            dp3=dp;
        }
        
        return Math.min(dp1,Math.min(dp2,dp3));
    }
}