class Solution {
    //Jai Baba Bhole
    public int arraySign(int[] nums) {
        
        int prod=1;
        for(int num:nums){
            if(num==0){
                return 0;
            }
            prod*=num<0?-1:1; //for avoid the overflow 
        }
        return prod<0?-1:1;
    }
}