class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        int []res=new int[nums.length];
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                res[index]=nums[left]*nums[left];
                left++;
            }
            else
            {
                res[index]=nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return res;
    }
}