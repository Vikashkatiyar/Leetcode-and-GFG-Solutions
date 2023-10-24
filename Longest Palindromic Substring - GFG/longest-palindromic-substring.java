//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestPalindrome(String str){
       
       int n=str.length();
       boolean[][] dp=new boolean[n][n];
       int maxLen=Integer.MIN_VALUE;
       String ans="";
       //Gap Strategy
       for(int g=0;g<dp.length;g++){
           for(int i=0,j=g;j<dp[0].length;i++,j++){
               if(g==0){
                   dp[i][j]=true;
               }else if(g==1){
                   dp[i][j]=str.charAt(i)==str.charAt(j);
               }else{
                   if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]==true){
                       dp[i][j]=true;
                   }
               }
               
               
               if(dp[i][j]==true){
                   String temp=str.substring(i,j+1);
                   if(maxLen<temp.length()){
                       maxLen=temp.length();
                       ans=temp;
                   }
               }
           }
       }
       return ans;
    }
}