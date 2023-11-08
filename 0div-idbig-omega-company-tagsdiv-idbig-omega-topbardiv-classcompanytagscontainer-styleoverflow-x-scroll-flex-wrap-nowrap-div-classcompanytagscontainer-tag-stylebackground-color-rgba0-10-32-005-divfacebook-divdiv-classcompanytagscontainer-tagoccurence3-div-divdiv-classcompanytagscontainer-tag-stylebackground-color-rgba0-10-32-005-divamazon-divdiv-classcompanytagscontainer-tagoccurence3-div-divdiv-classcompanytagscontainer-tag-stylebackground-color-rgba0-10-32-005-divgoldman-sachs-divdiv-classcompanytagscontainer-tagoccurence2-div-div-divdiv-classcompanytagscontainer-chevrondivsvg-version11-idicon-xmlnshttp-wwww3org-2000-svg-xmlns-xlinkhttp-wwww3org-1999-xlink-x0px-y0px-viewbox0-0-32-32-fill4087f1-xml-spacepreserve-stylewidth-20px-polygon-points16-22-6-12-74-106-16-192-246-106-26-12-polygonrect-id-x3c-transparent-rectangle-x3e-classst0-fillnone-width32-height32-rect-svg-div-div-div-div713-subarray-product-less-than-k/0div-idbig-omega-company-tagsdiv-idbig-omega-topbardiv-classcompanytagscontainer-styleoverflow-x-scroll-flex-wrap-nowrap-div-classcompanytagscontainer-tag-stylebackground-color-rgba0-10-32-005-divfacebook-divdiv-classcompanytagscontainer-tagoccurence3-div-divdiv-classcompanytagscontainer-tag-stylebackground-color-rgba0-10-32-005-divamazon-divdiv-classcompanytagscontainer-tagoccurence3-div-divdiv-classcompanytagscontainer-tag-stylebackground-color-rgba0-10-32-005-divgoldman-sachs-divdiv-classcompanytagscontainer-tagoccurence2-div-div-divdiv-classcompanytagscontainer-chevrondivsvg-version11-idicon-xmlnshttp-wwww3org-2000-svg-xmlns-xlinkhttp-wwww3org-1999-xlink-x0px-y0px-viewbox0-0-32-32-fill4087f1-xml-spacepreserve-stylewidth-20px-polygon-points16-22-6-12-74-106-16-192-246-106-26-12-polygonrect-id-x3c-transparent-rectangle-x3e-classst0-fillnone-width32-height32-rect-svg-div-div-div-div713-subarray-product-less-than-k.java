class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int n=nums.length;
        
        int s=0,e=0;
        int prod=1;
        int ans=0;
        
        while(e<n){
            prod*=nums[e];
            
            while(s<=e &&  prod>=k){
                prod/=nums[s];
                s++;
            }
            
            ans+=(e-s+1);
            e++;
        }
        return ans;
    }
}