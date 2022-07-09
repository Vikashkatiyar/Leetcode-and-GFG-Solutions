class Solution {
    public int jump(int[] nums) {
//          int n = nums.length;
//         int[] dp = new int[n];
    
//         dp[0] = 0;
//         for(int i=1;i<n;i++){
//           for(int j=0;j<i;j++){
//             if(j+nums[j]>=i){
//               dp[i] = dp[j]+1;
//             }
//           }
//         }
//       return dp[n-1];
        
        
        
        //TC:O(n)
        //SC:O(1)
        int level=0;
        int divider=0;
        int maxRechableidx=0;
        
        for(int i=0;i<nums.length;i++){
            if(i>divider){
                level++;
                divider=maxRechableidx;
            }
            maxRechableidx=Math.max(maxRechableidx,i+nums[i]);
        }
        return level;
    }
}