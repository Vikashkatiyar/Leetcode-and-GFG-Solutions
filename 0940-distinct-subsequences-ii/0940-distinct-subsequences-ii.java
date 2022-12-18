class Solution {
    //refer to pepcoding video and must dry run it 
    long MOD=1000000007;
    public int distinctSubseqII(String s) {
        long []dp=new long[s.length()+1];
        dp[0]=1;
        dp[1]=2;
        
        int[] lo=new int[26];
        lo[s.charAt(0)-'a']=1;
        
        for(int i=2;i<dp.length;i++){
            dp[i]=(2*dp[i-1])%MOD;
            
            int chIdx=s.charAt(i-1)-'a';
            if(lo[chIdx]!=0){
                dp[i]=(dp[i]-dp[lo[chIdx]-1]+MOD)%MOD;
            }
            lo[chIdx]=i;
        }
        if(dp[s.length()] < 0){
            dp[s.length()] += MOD;
        }
        return (int)((dp[s.length()] - 1+MOD) % MOD);
    }
}