class Solution {
    public int rob(int[] nums) {
//         int n=nums.length;
//         if(nums.length==1){
//             return nums[0];
//         }
//         int []dp=new int[nums.length];
//         dp[0]=nums[0];
//         dp[1]=Math.max(nums[0],nums[1]);
//         for(int i=2;i<nums.length;i++){
//             dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
            
//         }
//         return dp[n-1];
        
        int prev=0;
        int last=0;
        int temp=0;
        for(int curr:nums){
            temp=last;
            last=Math.max(prev+curr,last);
            prev=temp;
            
        }
        return last;
    }
}