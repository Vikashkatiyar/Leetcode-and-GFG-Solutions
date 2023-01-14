//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		
		sc.nextLine();
		while(t-->0)
		{
		   //taking String X and Y
		   String S[]=sc.nextLine().split(" ");
		   String X=S[0];
		   String Y=S[1];
		   
		   //calling function shortestCommonSupersequence()
		   System.out.println(new Solution().shortestCommonSupersequence(X, Y, X.length(), Y.length()));
		}
	}




       
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
       int [][]dp=new int[m+1][n+1];
       for(int i=X.length()-1;i>=0;i--){
           for(int j=Y.length()-1;j>=0;j--){
               if(X.charAt(i)==Y.charAt(j)){
                   dp[i][j]=1+dp[i+1][j+1];
               }else{
                   dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
               }
           }
       }
       
       return m+n-dp[0][0];
    }
}