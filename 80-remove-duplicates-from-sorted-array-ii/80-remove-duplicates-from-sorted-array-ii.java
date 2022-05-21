class Solution {
    public int removeDuplicates(int[] nums) {
        int oidx=0;
        int i=0;
        while(i<nums.length){
            int sidx=i;
            while(i<nums.length-1 && nums[i]==nums[i+1])
            {
              i++;  
            }     
          int  length=i-sidx+1;
            int freq=Math.min(length,2);
            while(freq-->0){
                nums[oidx]=nums[sidx];
                oidx++;
            }
            i++;
        }
        return oidx;
    }
}