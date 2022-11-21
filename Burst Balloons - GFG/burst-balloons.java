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
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.maxCoins(n,a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static int maxCoins(int N, int[] nums) {
      //must do revision
    int [][]dp=new int[nums.length][nums.length];
        
        for(int g=0;g<dp[0].length;g++){
            for(int i=0,j=g;j<dp[0].length;i++,j++){
                
                
                for(int lk=g+1,rk=1;lk>=1;lk--,rk++){
                    int left=(lk==g+1?0:dp[i][j-lk]);
                    int right=(rk==g+1?0:dp[i+rk][j]);
                    int val=(i-1>=0?nums[i-1]:1)*
                        nums[i+rk-1]*
                        (j+1<nums.length?nums[j+1]:1);
                    
                    dp[i][j]=Math.max(dp[i][j],left+right+val);
                }
            }
        }
        return dp[0][dp[0].length-1];
  }
}
     