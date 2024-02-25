class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        
        //find the break point from last where nums[i] < nums[i+1] 
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                idx=i;
                break;
            }
        }
        
        //if fully array is incresing order then simply reverse
        if(idx==-1){
            reverse(nums, 0, n-1);
            return;
        }
        
        //find the just greater number of nums[idx]
        for(int i=n-1;i>idx;i--){
            if(nums[i] > nums[idx]){
                swap(nums, i, idx);
                break;
            }
        }
        
        reverse(nums, idx+1, n-1);
        return;
    }
    
    private void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    private void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i++, j--);
        }
    }
}