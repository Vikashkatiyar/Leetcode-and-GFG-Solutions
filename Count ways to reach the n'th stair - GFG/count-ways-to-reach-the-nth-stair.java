//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    int MOD=1000000007;
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        int []dp=new int[n+1];
        
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            int val=(dp[i-2]%MOD)+(dp[i-1]%MOD);
            dp[i]=val%MOD;
        }
        
        return dp[n];
        
    }
}

