class Solution {
    //O(nlogn)
    public int smallestDivisor(int[] nums, int threshold) {
        int lo=1;
        int hi=Integer.MIN_VALUE;
        for(int num:nums){
            hi=Math.max(num,hi);
        }
         while(lo<hi){
             int mid=(lo+hi)/2;
             
             int sum=0;
             for(int val:nums){
                 int quo=(val+mid-1)/mid;//+mid-1 is for finding the ceil value 
                 sum+=quo;
             }
             if(sum>threshold){
                 lo=mid+1;
             }else{
                 hi=mid;
             }
             
         }
        return lo;
        
        
    }
}