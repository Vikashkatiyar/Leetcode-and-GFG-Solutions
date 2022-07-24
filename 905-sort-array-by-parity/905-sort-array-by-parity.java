class Solution {
    //O(N) SORT01
    public void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length){
            if(nums[i]%2==1){
                i++;
            }
            else{
                swap(nums,i,j);
                i++;
                j++;
            }
        }
        return nums;
    }
}