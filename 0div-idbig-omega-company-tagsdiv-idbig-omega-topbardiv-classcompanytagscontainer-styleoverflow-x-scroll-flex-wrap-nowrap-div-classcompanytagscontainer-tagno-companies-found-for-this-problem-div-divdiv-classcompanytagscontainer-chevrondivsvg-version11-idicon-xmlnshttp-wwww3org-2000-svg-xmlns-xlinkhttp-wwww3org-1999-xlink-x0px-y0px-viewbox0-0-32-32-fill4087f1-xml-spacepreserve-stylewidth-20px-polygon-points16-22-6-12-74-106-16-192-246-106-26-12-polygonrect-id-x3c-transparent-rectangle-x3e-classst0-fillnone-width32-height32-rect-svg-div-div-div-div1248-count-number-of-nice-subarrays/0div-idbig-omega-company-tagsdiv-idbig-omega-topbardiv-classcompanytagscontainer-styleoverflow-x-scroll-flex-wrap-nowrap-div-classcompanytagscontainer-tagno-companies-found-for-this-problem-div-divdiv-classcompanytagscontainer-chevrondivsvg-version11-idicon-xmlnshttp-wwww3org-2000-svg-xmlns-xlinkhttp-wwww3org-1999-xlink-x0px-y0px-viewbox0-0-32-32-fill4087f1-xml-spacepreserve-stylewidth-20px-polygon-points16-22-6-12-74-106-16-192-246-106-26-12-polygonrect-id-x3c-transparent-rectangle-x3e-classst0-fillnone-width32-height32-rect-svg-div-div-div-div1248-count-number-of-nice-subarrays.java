class Solution {
     public int numberOfSubarrays(int[] nums, int k){
         return  numberOfSubarraysHelper(nums,k)-numberOfSubarraysHelper(nums,k-1);
     }
    public int numberOfSubarraysHelper(int[] nums, int k) {
        int n=nums.length;
        int s=0;
        int e=0;
        
        int ans=0;
        int odd=0;
        while(e<n){
            if(nums[e]%2==1){
                odd++;
            }
            
            while(odd>k){
                if(nums[s]%2==1){
                    odd--;
                }
                s++;
            }
            
            ans+=(e-s+1);
            e++;
        }
        
        return ans;
    }
}