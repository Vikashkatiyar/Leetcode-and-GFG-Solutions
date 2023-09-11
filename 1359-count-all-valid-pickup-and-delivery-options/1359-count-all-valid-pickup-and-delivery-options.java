class Solution {
    int MOD=(int)10_000_000_07;
    public int countOrders(int n) {
        long []dp=new long[501];
        
        dp[1]=1L;
        dp[2]=6L;
        
        for(int i=3;i<=n;i++){
            int oddNo=2*i-1;
            int permutation=(oddNo*((oddNo+1)/2))%MOD;
            dp[i]=(dp[i-1]*permutation)%MOD;
        }
        
        return (int)dp[n];
    }
}