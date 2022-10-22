//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of steps in stair
            int n = sc.nextInt();
            
            //calling method countWays() of class Hops
            System.out.println(new Solution().countWays(n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
     
    static long countWays(int n)
    {
        long MOD=1000000007;
        long []dp=new long[n+3];
        
       
        dp[1]=1L;
        dp[2]=2L;
        dp[3]=4L;
        

        
        for(int i=4;i<dp.length;i++){
            dp[i]=(dp[i-1]+dp[i-2]+dp[i-3])%1000000007;
        }
        return dp[n]%MOD;
    }
    
}

