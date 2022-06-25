class Solution {
    //TC=O(n)
    //SC=O(1)
    public boolean checkPossibility(int[] nums) {
        int modifiactionCount=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                modifiactionCount++;
                
                if(i>=2 && nums[i-2]>nums[i]){
                    nums[i]=nums[i-1];
                }else{
                    nums[i-1]=nums[i];
                }
            }
        }
        return modifiactionCount<=1;
    }
}