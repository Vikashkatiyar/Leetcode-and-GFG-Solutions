class Solution {
    public boolean canJump(int[] nums) {
        int reacheble=0;
        for(int i=0;i<nums.length;i++){
            if(reacheble<i){ //this handle the Zero part 
                return false;
            }
            reacheble=Math.max(reacheble,i+nums[i]);
        }
        return true;
    }
}