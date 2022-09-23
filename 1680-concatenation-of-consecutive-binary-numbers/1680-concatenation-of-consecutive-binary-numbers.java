class Solution {
    public int concatenatedBinary(int n) {
         int mod=1000000007;
        int res=0;
        
        for(int i=1;i<=n;i++){
           String binary=Integer.toBinaryString(i);
            
            for(char c:binary.toCharArray()){
                int val=(c=='0')?0:1;
                
                res=((res*2)+val)%mod;
            }
        }
        return res;
    }
}