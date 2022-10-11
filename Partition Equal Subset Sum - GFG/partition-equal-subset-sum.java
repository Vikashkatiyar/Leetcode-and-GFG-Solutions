//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int nums[])
    {
       int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int target=0;
        if(sum%2==0){
           target=sum/2; 
        }else{
            return 0;
        }
        int [][]dp=new int[nums.length+1][target+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0&& j==0){
                    dp[i][j]=1;
                }else if(i==0){
                    dp[i][j]=0;
                }else if(j==0){
                    dp[i][j]=1;
                }else{
                    if(dp[i-1][j]==1){
                        dp[i][j]=1;
                    }else{
                        int val=nums[i-1];
                        if(j>=val){
                            if(dp[i-1][j-val]==1)
                                dp[i][j]=1;
                        }
                    }
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}