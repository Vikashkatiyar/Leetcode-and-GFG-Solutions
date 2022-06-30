class Solution {
    // TC:O(n)
    // SC:O(1)
    // public int minMoves(int[] nums) {
    //     int min=Integer.MAX_VALUE;
    //     for(int ele:nums){
    //         min=Math.min(ele,min);
    //     }
    //     int count=0;
    //     for(int ele:nums){
    //         count+=Math.abs(min-ele);
    //     }
    //     return count;
    // }
    
    
    
    
    //TC:(nlogn)
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        
        int count=0;
        for(int ele:nums){
            count+=Math.abs(ele-nums[0]);
        }
        return count;
    }
    
}