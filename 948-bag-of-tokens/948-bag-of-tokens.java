class Solution {
    public int bagOfTokensScore(int[] nums, int power) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int src=0;
        int maxSrc=0;
        while(i<=j){
            if(power>=nums[i]){
                power-=nums[i];
                i++;
                src++;
                maxSrc=Math.max(src,maxSrc);
            }else if(src>0){
                power+=nums[j];
                src--;
                j--;
            }else{
                break;
            }
        }
        return maxSrc;
    }
}