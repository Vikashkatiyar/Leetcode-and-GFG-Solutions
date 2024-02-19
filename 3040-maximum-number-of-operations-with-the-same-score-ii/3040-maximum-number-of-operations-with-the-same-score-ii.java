class Solution {
    public int maxOperations(int[] nums) {
        int maxOpr=0;
        int len=nums.length;
        int[][]dp=new int[len][len];
        int i=0, j=len-1;
        
        maxOpr=Math.max(maxOpr,1+solve(nums, i+2, j, nums[i]+nums[i+1], dp)); //take first two
        maxOpr=Math.max(maxOpr,1+solve(nums, i+1, j-1, nums[i]+nums[j], dp)) ;//take first&last
        maxOpr=Math.max(maxOpr,1+solve(nums, i, j-2, nums[j]+nums[j-1], dp)); //take last two

        return maxOpr;    
    }
    
    private int solve(int[] nums, int left, int right,int target, int[][] dp){
        if(left>=right){
            return 0;
        }
        
        if(dp[left][right]!=0){
            return dp[left][right];
        }
        
        int maxOps=0;
        if(nums[left]+nums[left+1]==target){
            maxOps=Math.max(maxOps, 1+solve(nums, left+2, right, target, dp));
        }
        
        if(nums[left]+nums[right]==target){
            maxOps=Math.max(maxOps, 1+solve(nums, left+1, right-1, target, dp));
        }
        
        if(nums[right]+nums[right-1]==target){
            maxOps=Math.max(maxOps, 1+solve(nums, left, right-2, target, dp));
        }
        
        return dp[left][right]=maxOps;
    }
    
}