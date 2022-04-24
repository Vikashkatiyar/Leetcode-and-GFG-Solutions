class Solution {
    public void moveZeroes(int[] arr) {
       int nonzero=0;
        
        for(int curr=0;curr<arr.length;curr++){
            if(arr[curr]!=0){
                swap(arr,curr,nonzero++);
            }
        }
        
        
    }
    void swap(int []nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
}
