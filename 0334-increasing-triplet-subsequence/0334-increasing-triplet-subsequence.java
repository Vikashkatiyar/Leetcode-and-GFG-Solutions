class Solution {
    public boolean increasingTriplet(int[] nums) {
        int firstMax = Integer.MAX_VALUE, secondMax = Integer.MAX_VALUE;
        for(int val : nums){
            if(val <= firstMax)    firstMax = val;
            else if(val < secondMax)    secondMax = val;
            else if(val > secondMax) 
                return true;
        }
        return false;
    }
}