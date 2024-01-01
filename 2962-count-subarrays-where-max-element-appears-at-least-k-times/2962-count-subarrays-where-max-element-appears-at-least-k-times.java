class Solution {
    // Jai Bhole
    public long countSubarrays(int[] nums, int k) {
        
        int max=Integer. MIN_VALUE;
        for(int num:nums){
            max=Math.max(max, num);
        }
        
        int count=0, i=0, j=0,  n=nums.length;
        long ans=0;
        
        while(j<n){
            if(nums[j]==max){
                count++;
            }
            
            while(count>=k){
                ans+=(n-j);
                if(nums[i]==max){
                    count--;
                }
                i++;
            }
            j++;
        }
        
        return ans;
    }
}