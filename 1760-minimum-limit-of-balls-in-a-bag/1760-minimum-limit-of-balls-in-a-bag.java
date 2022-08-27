//Similar to Split Array Largest Sum
class Solution {
    //TC:O(nlog(sum_of_all_elements_of_array))
    public int minimumSize(int[] nums, int maxOperations) {
        int lo=1;
        int hi=0;
        for(int num:nums){
            hi=Math.max(num,hi);
        }
        
        while(lo<hi){
            int mid=(lo+hi)/2;
            
            int opsReq=0;
            for(int ball:nums){
                if(ball>mid){
                    int spare=ball-mid;
                    int ops=(spare+mid-1)/mid;
                    opsReq+=ops;
                }
            }
            
            if(opsReq>maxOperations){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
    }
}