class Solution {
    
    public int firstOcc(int []nums,int target)
    {
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
               left=mid+1; 
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
    
    
    
    
    public int lastOcc(int []nums,int target)
    {
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
               left=mid+1; 
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
    
    
    
    
    public int[] searchRange(int[] nums, int target) 
    {
        int []ans={-1,-1};
        if(nums.length==0) return ans;
        ans[0]=firstOcc(nums,target);
        ans[1]=lastOcc(nums,target);
        return ans;
        
 }
}
