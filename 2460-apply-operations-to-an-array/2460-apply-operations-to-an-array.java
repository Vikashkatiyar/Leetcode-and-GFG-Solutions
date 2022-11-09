class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                nums[i-1]*=2;
                nums[i]=0;
            }
        }
        
        moveZeroLast(nums);
        return nums;
        
    }
    public void moveZeroLast(int []nums){
        
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=0){
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                j++;
            }
        }
    }
}