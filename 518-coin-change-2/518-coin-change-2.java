class Solution {
    public int change(int target, int[] nums) {
        int []dp=new int[target+1];
        dp[0]=1;
        
        for(int j=0;j<nums.length;j++){
            for(int i=1;i<=target;i++){
                    int remVal=i-nums[j];
                if(remVal>=0){
                    dp[i]+=dp[remVal];
                }
            }
        }
        
        return dp[target];
    }
}
