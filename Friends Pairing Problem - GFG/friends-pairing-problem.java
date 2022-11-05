//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.countFriendsPairings(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int MOD=1000000007;
    public long countFriendsPairings(int n) 
    { 
       long[] dp=new long[n+1];
       for(int i=1;i<dp.length;i++){
           if(i==1)
              dp[i]=1;
           else if(i==2)
              dp[i]=2;
            else{
                long val=((i-1)*dp[i-2])%MOD;
                dp[i]=(dp[i-1]+val)%MOD;
            }      
       }
       return dp[n];
    }
}    
 