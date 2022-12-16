//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      int ans = obj.uglyNumber(n);
      System.out.println(ans);
    }
  }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
  public static int uglyNumber(int n) {
    int []dp=new int[n+1];
    dp[1]=1;
     
     int io2=1;
     int io3=1;
     int io5=1;
     for(int i=2;i<dp.length;i++){
         int mo2=2*dp[io2];
         int mo3=3*dp[io3];
         int mo5=5*dp[io5];
         dp[i]=Math.min(mo2,Math.min(mo3,mo5));
         
         
         if(dp[i]==mo2){
             io2++;
         }
         if(dp[i]==mo3){
             io3++;
         }
         if(dp[i]==mo5){
             io5++;
         }
         
     }

    return dp[n];
  }
}
     