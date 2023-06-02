class Solution {
    public int singleNumber(int[] nums) {
        int XOR=0;
        for(int val:nums){
            XOR=XOR^val;
        }
        return XOR;
    }
}