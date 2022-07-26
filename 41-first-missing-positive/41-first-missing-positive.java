class Solution {
    //O(n)
    //O(1)
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>n){
                nums[i]=n+1;
            }
        }
        
        
        for(int i=0;i<n;i++){
            int val=Math.abs(nums[i]);
            if(val<=n){//if val is lower or equal to length of array
                int idx=val-1;
                if(nums[idx]>0){ //if number is only +ve
                    nums[idx]=-1*nums[idx];
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}