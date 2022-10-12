class Solution {
    //TC:O(nlogn)
    //SC:O(1)
    public int largestPerimeter(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        for(int i=nums.length-3;i>=0;i--){
            int a=nums[i];
            int b=nums[i+1];
            int c=nums[i+2];
            if(a+b>c){
                res+=a+b+c;
                break;
            }
        }
        return res;
    }
}