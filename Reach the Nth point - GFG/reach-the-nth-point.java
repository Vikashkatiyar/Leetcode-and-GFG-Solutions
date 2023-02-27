//{ Driver Code Starts
//Initial Template for Java

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
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    int MOD=1000000007;
    public int nthPoint(int n)
    {
       int[] dp=new int[n+1];
       dp[0]=1;
       dp[1]=1;
       
       for(int i=2;i<=n;i++){
           dp[i]=(dp[i-2]+dp[i-1])%MOD;
       }
       
       return dp[n];
    }
}