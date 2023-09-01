class Solution {
    
    
    // public int countSetBitsHelper(int n){
    //     int count=0;
    //     while(n!=0){
    //         int rsb=n&-n;
    //         n=n-rsb;
    //         count++;
    //     }
    //     return count;
    // }
    
    public int[] countBits(int n) {
        
//         Approach1:-O(nlogn)
//         int[] ans=new int[n+1];
//         ans[0]=0;
//         for(int i=1;i<=n;i++){
//             ans[i]=countSetBitsHelper(i);
//         }
//         return ans;
        
        
            // Approach2:-O(nlogn)
            int[] ans=new int[n+1];
            for(int i=0;i<=n;i++){
                ans[i]=Integer.bitCount(i);
            }
            return ans;
        
       // Approach3:-DP+BitMasking =>O(1)
            // int[] res=new int[n+1];
            // for(int idx=1;idx<=n;idx++){
            //     res[idx]=res[(idx>>1)]+(idx & 1);  //res[idx]=res[(idx/2)]+(idx%2);
            // }
            // return res;
    }
}