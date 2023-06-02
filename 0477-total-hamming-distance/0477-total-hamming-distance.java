class Solution {
    public int approach1(int[] nums){
        //gives TLE O(n2)
      int sum=0;
        for(int a:nums)
            for(int b:nums)
                sum+=Integer.bitCount(a^b);
        
        return sum/2; //a^b ==b^a
    }
    public int approach2(int[] nums){
        //O(nlogn)
        int sum=0;
        for(int bit=0;bit<32;bit++){
            int zero=0,one=0;
            for(int val:nums){
                if((val&(1 << bit))==0){
                    zero++;
                }else{
                    one++;
                }
            }
            sum=sum+(zero*one);
        }
        return sum;
    }
    public int totalHammingDistance(int[] nums) {
        // approach1(nums);
        return approach2(nums);
    }
}