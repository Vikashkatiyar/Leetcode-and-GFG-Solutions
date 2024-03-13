class Solution {
    public int coinChange(int[] coins, int tar) {
        int []dp=new int[tar+1];
        dp[0]=0;
        
        
        for(int amt=1;amt<=tar;amt++){
            int count = Integer.MAX_VALUE;
            for(int coin:coins){
                if(coin<=amt){
                   count = Math.min(dp[amt-coin] , count);
                }
            }
            dp[amt] = count == Integer.MAX_VALUE ? Integer.MAX_VALUE : count+1;
        }
         return dp[tar] == Integer.MAX_VALUE ? -1:dp[tar];
    }
    
//     public int recursive(int[] coins, int amount){
//         if(amount==0){
//             return 1;
//         }
        
//         int ans=0;
//         for(int i=0;i<coins.length;i++)
//         {
//             if(amount-coins[i]>=0){
//               ans+= coinChange(coins, amount-coins[i]);
//             }
//         }
        
//         return ans;
//     }
}