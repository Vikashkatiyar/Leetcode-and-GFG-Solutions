class Solution {
    long mod=1000000007L;
    public int sumSubseqWidths(int[] nums) {
        Arrays.sort(nums);
        long ans=0;
        long p=1;
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
            ans=(ans+p*nums[i]-p*nums[j])%mod;
            p=(p*2)%mod;
            j--;
        }
        return (int)ans;
    }
}