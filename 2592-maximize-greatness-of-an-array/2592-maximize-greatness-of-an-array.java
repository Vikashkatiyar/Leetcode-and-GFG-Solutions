class Solution {
    //jai bhole
    public int maximizeGreatness(int[] nums) {
        
        int res=0;
        Arrays.sort(nums);
        for(int num:nums){
            if(num>nums[res]){
                res++;
            }
        }
        return res;
    }
}