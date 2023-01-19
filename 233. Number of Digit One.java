class Solution {
    public int countDigitOne(int n) {
        int res=0;

        int place=1;
        while(place<=n){  //4687
            int quotient=n/(10*place);  // 468
            int rem=n%(10*place);  // 7

            int extra=0;   // 7
            if(rem>=2*place){
                extra=place;
            }else if(rem>=place){
                extra=rem-place+1;
            }else{
                extra=0;
            }

            res+=quotient*place + extra;  // 468*10+7
            
            place=place*10;
        }
        return res;
    }
}
