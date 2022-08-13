class Solution {
    //TC:O(n)
    //SC:O(1)
    public int minMoves(int[] nums) {
      int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
        }
        
        int res=0;
        for(int i=0;i<nums.length;i++){
          res+=nums[i]-min;
        }
        return res;
    }
    
    
    
    
//     //TC:(nlogn)
//     public int minMoves(int[] nums) {
//         Arrays.sort(nums);
        
//         int count=0;
//         for(int ele:nums){
//             count+=Math.abs(ele-nums[0]);
//         }
//         return count;
//     }
    
}