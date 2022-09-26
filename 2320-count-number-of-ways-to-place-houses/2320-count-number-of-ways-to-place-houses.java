class Solution {
    static int MOD=1000000007;
    public int countHousePlacements(int n) {
        long s=1;
        long b=1;
        for(int i=2;i<=n;i++){
            long c=(s+b)%MOD;
            
            s=b;
            b=c;
        }
        
     long tot=(s+b)%MOD;
     long ans=(tot*tot)%MOD;
        return (int)ans;
    }
    
}