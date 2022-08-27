class Solution {
    public int shipWithinDays(int[] nums, int m) {
        int hi=0;
        int lo=Integer.MIN_VALUE;
        for(int num:nums){
            hi+=num;
            lo=Math.max(num,lo);
        }
       
        while(lo<hi){
            int mid=(lo+hi)/2;
            
            int countParts=1;
            int currPartSum=0;
            for(int num:nums){
                if(currPartSum+num<=mid){
                    currPartSum+=num;
                }else{
                    
                    currPartSum=num;
                    countParts++;
                }
            }
            
            if(countParts>m){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
    }
}