//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfWays(N));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int MOD=1000000007;
    static Long numberOfWays(int N) {
         // code here
        //  if(N<=2){
        //      return (long)N;
        //  }
        //  return numberOfWays(N-1)+numberOfWays(N-2);
        
        long[] dp=new long[N+1];
        for(int i=1;i<dp.length;i++){
            if(i==1){
                dp[i]=1;
            }else if(i==2){
                dp[i]=2;
            }else{
                dp[i]=(dp[i-1]+dp[i-2])%MOD;
            }
        }
        return dp[N];
    }
};