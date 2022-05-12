class Solution {
    public int findMin(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        
        if(nums[lo]<=nums[hi]){
            return nums[0];
        }
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(nums[mid]>nums[mid+1]){ //it is mandatory to write first because test case:5 1 2 3 4  6
                 return nums[mid+1];
            }
            else if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            else if(nums[lo]<=nums[mid]){
                  lo=mid+1;
            }
            else if(nums[mid]<=nums[hi]){
                hi=mid-1;
            }
        }
        return -1;
    }
}