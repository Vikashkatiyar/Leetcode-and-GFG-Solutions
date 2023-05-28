class Solution {
    //Jai baba bhole
    int mod=1000000007;
    public int sumOfPower(int[] nums) {
        long ans=0;
        long prevCon=0;
        Arrays.sort(nums);
        for(long num:nums){
            long currEle=(((num*num)%mod)*num)%mod;
            long allBackEle=(((num*num)%mod)*prevCon)%mod;
            ans=(ans+currEle+allBackEle)%mod;
            prevCon=(prevCon*2+num)%mod;
        }
        return (int)ans;
    }
}