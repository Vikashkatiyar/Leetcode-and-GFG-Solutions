class Solution {
    public int search(int[] nums, int target) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>nums[hi]){
                lo=mid+1;
            }else{
                hi=mid;            }
        }
        
        int rot=lo;
        
        int s1=binarySearch(nums,0,rot-1,target);
        if(s1!=-1){
            return s1;
        }
        
        int s2=binarySearch(nums,rot,nums.length-1,target);
        return s2;
            
    }
    
    public int binarySearch(int[] nums,int lo,int hi,int target){
        
         while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
         }
        
        return -1;
    }
}