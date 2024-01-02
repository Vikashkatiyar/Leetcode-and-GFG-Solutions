class Solution {
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        long lo=1, hi=(int)10e10;
        
        long ans=hi;
        long lcm=((long)divisor1 * (long)divisor2)/ gcd(divisor1, divisor2);
        
        while(lo<hi){
            long mid=lo+(hi-lo)/2;
            int a=(int)(mid-mid/divisor1); //all not divided by 1
            int b=(int)(mid-mid/divisor2);
            int c=(int)(mid-mid/lcm);
            
            if(a< uniqueCnt1 || b< uniqueCnt2 || c< uniqueCnt1+uniqueCnt2){
                lo=mid+1;
            }else{
                hi=mid;
            }
            
        }
        return (int)lo;
    }
}