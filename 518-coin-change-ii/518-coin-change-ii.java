class Solution {
    //coin change combination
    public int change(int amount, int[] coins) {
        int []dp=new int[amount+1];
        dp[0]=1;
        
        for(int i=0;i<coins.length;i++){ // take one coin at a time
            for(int j=1;j<=amount;j++){ //iterate only one coin on whole dp table(amount)
                if(j-coins[i]>=0){
                    dp[j]+=dp[j-coins[i]];
                }
            }
        }
        return dp[amount];
    }
}