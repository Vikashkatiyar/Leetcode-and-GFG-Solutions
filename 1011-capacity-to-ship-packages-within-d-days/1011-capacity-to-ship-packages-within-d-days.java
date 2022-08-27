class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int hi=0;
        int lo=Integer.MIN_VALUE;
        for(int wt:weights){
            hi+=wt;
            lo=Math.max(wt,lo);
        }
       
        while(lo<hi){
            int mid=(lo+hi)/2;
            
            int countParts=1;
            int currPartSum=0;
            for(int wt:weights){
                if(currPartSum+wt<=mid){
                    currPartSum+=wt;
                }else{
                    
                    currPartSum=wt;
                    countParts++;
                }
            }
            
            if(countParts>days){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
    }
}