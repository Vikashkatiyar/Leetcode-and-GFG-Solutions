class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n=nums.length;
        
        int s=0,e=0;
        long ans=0;
        long sum=0;
        
        while(e<n){
            sum+=nums[e];
            
            while(sum*(e-s+1)>=k){
                sum-=nums[s];
                s++;
            }
            
            ans+=(e-s+1);
            e++;
        }
        return ans;
        
    }
}