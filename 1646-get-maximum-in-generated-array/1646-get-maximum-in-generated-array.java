class Solution {
    public int getMaximumGenerated(int n) {
        if(n<2){
            return n;
        }
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int max=0;
        for(int i=2;i<dp.length;i++){
            if(i%2==0){
                dp[i]=dp[i/2];
                max=Math.max(max,dp[i]);
            }else{
                dp[i]=dp[i/2]+dp[(i+1)/2];
                max=Math.max(max,dp[i]);
            }
        }
        return max;
        
    }
}