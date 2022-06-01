class Solution {
    public void moveZeroes(int[] nums) {
     int l=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[r]==0){
                r++;
            }
            else{
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                
                l++;
                r++;
            }
        }
    }
}