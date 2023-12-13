class Solution {
    // LC-75
    public boolean increasingTriplet(int[] nums) {
        int firstMax=Integer.MAX_VALUE;
        int secondMax=Integer.MAX_VALUE;
        
        for(int num: nums){
            if(num<=firstMax){
                firstMax=num;
            }else if(num<secondMax){
                secondMax=num;
            }else if(num>secondMax){
                return true;
            }
        }
        
        return false;
    }
}