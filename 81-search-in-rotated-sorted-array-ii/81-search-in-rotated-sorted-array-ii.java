class Solution {
    //similar as find minimum element in sorted II
    public boolean search(int[] nums, int target) {
         int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(target==nums[mid]){
                return true;
            }
            
            if(nums[mid]>nums[hi]){  //lo to mid sorted
                if(target>=nums[lo] && target<=nums[mid]){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }else if(nums[mid]<nums[hi]){ //mid to hi sorted
                if(target>=nums[mid] && target<=nums[hi]){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }else{
                hi--;
            }
        }
        return false;
    }
}