class Solution {
    public int pivotIndex(int[] nums) {
      
        
        if(nums.length==1){
            return 0;
        }
        
        
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        
        int leftsum=0;
        int rsum=totalsum;
        for(int i=0;i<nums.length;i++){
            rsum-=nums[i];//
            if(leftsum==rsum){//comparing right sum with left sum
                return i;
            }
            leftsum+=nums[i];
            
        }
        return -1;
    }
}