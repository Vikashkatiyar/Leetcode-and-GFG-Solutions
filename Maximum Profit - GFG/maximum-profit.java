//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(in.readLine());
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxProfit(K, N, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int maxProfit(int k, int N, int arr[]) {
        int n=arr.length;
        int[][] dp=new int[k+1][n];
        
        for(int t=1;t<=k;t++){
            for(int d=1;d<n;d++){
                int max=dp[t][d-1];
                
                for(int pd=0;pd<d;pd++){
                    int pastDayTransc=dp[t-1][pd];
                    int leftOutTranc=arr[d]-arr[pd];
                    
                    if(pastDayTransc+leftOutTranc>max){
                        max=pastDayTransc+leftOutTranc;
                    }
                }
                
                dp[t][d]=max;
            }
        }
        
        return dp[dp.length-1][dp[0].length-1];
    }
}