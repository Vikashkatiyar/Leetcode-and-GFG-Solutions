class Solution {
    
    //Jai Bhole
    public int minimizeSum(int[] nums) {
        /*
        Change two biggest,
        then the high score is A[n-3] - A[0]

        Change the biggest and the smallest,
        then the high score is A[n-2] - A[1]

        Change two smallest,
        then the high score is A[n-1] - A[2]

        For the low score,
        we can always have 2 same numbers,
        so low score is 0.
        */
        
        Arrays.sort(nums);
        int n=nums.length;
        int ans=Math.min(nums[n-3]-nums[0],Math.min(nums[n-2]-nums[1],nums[n-1]-nums[2]));
        return ans;
        
    }
}