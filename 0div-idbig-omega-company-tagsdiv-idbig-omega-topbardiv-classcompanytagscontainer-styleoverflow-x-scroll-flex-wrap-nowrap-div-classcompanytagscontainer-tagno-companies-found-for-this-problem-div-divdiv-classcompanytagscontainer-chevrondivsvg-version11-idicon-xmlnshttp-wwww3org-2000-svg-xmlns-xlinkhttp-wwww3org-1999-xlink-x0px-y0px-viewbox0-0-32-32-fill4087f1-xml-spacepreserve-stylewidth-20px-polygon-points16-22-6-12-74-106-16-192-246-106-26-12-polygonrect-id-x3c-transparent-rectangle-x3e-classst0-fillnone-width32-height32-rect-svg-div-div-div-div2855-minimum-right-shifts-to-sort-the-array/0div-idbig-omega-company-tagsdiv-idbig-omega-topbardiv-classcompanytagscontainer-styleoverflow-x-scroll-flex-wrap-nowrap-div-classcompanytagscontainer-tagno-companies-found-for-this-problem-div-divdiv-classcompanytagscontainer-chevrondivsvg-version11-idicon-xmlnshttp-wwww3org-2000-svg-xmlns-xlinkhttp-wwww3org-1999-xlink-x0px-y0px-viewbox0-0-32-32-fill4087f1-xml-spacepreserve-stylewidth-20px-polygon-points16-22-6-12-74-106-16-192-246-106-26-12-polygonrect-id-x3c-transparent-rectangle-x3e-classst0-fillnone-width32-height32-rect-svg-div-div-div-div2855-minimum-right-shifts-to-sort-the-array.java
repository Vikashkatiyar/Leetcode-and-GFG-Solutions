class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int idx=0;
        int count=0;
        for(int i=1;i<nums.size();i++){
            if(nums.get(i-1)>nums.get(i)){
                idx=i;
                count++;
            }
        }
        
        if(count>1){
            return -1;
        }
        
        if(idx==0){
            return 0;
        }
        
        return nums.get(nums.size()-1)>nums.get(0)?-1:nums.size()-idx;
    }
}