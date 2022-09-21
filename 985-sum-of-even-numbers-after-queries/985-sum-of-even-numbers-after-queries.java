class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] que) {
        int sum=0;
        for(int val:nums){
            if(val%2==0){
                sum+=val;
            }
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<que.length;i++){
           int val=que[i][0];
            int idx=que[i][1];
            if(nums[idx]%2==0){
                sum-=nums[idx];
            }
            nums[idx]+=val;
            if(nums[idx]%2==0){
                sum+=nums[idx];
            }
            
            ans[i]=sum;
        }
        return ans;
    }
    
}