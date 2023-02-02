//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int n, int mat[][])
    {
      int []prev=new int[n];
      for(int j=0;j<n;j++){
          prev[j]=mat[0][j];
      }
      
      for(int i=1;i<n;i++){
          int []curr=new int[n];
          for(int j=0;j<n;j++){
              int up=mat[i][j]+prev[j];
              int left=j-1>=0?mat[i][j]+prev[j-1]:Integer.MIN_VALUE;
              int right=j+1<n?mat[i][j]+prev[j+1]:Integer.MIN_VALUE;
              curr[j]=Math.max(up,Math.max(left,right));
          }
          prev=curr;
      }
      int max=prev[0];
      for(int i=1;i<n;i++){
          max=Math.max(max,prev[i]);
      }
      return max;
      
    }
}