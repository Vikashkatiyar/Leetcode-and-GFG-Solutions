class Solution {
    // TC:O(nlogn)
    // SC:O(1)
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            count+=nums[right]-nums[left];
            left++;
            right--;
        }
        return count;
    }
}