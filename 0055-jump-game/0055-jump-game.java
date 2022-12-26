class Solution {
    public boolean canJump(int[] nums) {
        //valley peak approach
        //https://www.youtube.com/watch?v=muDPTDrpS28 
        //O(n),O(1)
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