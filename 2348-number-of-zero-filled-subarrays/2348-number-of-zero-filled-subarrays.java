class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
                sum+=(count*(count+1)/2);
                 count=0;     
            }
        }
        sum+=(count*(count+1)/2);
        return sum;
    }
}