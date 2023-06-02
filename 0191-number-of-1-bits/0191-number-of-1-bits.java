public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
//         App1
//         return Integer.bitCount(n);
        
        
        
//         App2
//         int count=0;
//         for(int bit=0;bit<32;bit++){
//             if((n&(1<<bit))!=0){
//                 count++;
//             }
            
//         }
//         return count;
        
        
        // App3
        int count=0;
        while(n!=0){
            int rsb=n&-n;
            n=n-rsb;
            count++;
        }
        return count;
        
    }
}