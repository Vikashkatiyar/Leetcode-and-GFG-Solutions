class Solution {
    //O(N)
    public int dominantIndex(int[] nums) {
        int first=-1;
        int second=-1;
        int idx=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first){
                second=first;
                first=nums[i];
                idx=i;
            }
            else if(nums[i]>second && nums[i]!=first){
                second=nums[i];
            }
        }
        
        
        // if(nums[first]>=2*nums[second])
        //     return first;
        // else
        //     return -1;
        return first >= second* 2 ? idx : -1;

    }
}