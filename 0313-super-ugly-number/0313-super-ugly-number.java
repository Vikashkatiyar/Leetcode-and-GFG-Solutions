class Solution {
    // first refer to ugly number II
    //Similar as ugly number II
    public int nthSuperUglyNumber(int n, int[] primes) {
        long []dp=new long[n+1];
        dp[1]=1;
        
        int []indices=new int[primes.length];
        Arrays.fill(indices,1);
        
        for(int i=2;i<dp.length;i++){
            long ans=Long.MAX_VALUE;
            
            for(int j=0;j<indices.length;j++){
                //here primes are the 2,3,5
                int prime=primes[j];
                int idx=indices[j];
                ans=Math.min(ans,prime*dp[idx]);
            }
            dp[i]=ans;
            
            for(int j=0;j<indices.length;j++){ 
                //update the index of m02,mo3,mo5 similarly
                int prime=primes[j];
                int idx=indices[j];
                if(ans==prime*dp[idx]){
                    indices[j]=idx+1;
                }
            }
        }
        
        
        
        return (int)dp[n];
    }
}