//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.nthStair(n);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


class Solution
{
    public long nthStair(int n)
    {
         return countPaths( n);
        
    }
    
    public long countPaths(int n){
        // int []dp=new int[n+1];
        // dp[0] = 1;
        // dp[1] = 1;
        
        // for(int i=2;i<=n;i++) {
        //     dp[i] = dp[i-2] + 1; 
        // }
        
        // return dp[n];
        
        
        int a=1;
        int b=1;
        
        for(int i=2;i<=n;i++){
            int c=a+1;
            a=b;
            b=c;
        }
        return b;
    }
}