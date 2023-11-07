class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarraysWithSumHelp(nums,goal)-numSubarraysWithSumHelp(nums,goal-1);
    }
    public int numSubarraysWithSumHelp(int[] nums, int goal){
        int n=nums.length;
        
        int s=0,e=0;
        int ans=0;
        int sum=0;
        
        while(e<n){
            sum+=nums[e];
            
            while( s<=e && sum>goal){
                sum-=nums[s];
                s++;
            }
            
            ans+=(e-s+1);
            e++;
        }
        
        return ans;
    }
}