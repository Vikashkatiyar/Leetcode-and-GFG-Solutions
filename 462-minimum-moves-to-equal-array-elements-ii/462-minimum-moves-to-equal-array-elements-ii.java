class Solution {
    // TC:O(nlogn)
    // SC:O(1)
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median=nums[nums.length/2];
        int count=0;
        for(int ele:nums){
            count+=Math.abs(median-ele);
        }
        
        return count;
    }
}