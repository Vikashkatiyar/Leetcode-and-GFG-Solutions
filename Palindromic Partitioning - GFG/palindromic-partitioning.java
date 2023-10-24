//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int palindromicPartition(String s)
    {
       int n=s.length();
        boolean[][] dp=new boolean[n][n];
        // fill table of all the substring of a string is palindrome or not
        for(int g=0;g<n;g++){
            for(int i=0,j=g;j<dp.length;i++,j++){
                if(g==0){
                    dp[i][j]=true;
                }else if(g==1){
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    } else{
                        dp[i][j]=false;
                    }
                }
            }
        }
        
        //main code
        int [] strg=new int[n];
        strg[0]=0;
        for(int j=1;j<n;j++){
            if(dp[0][j]){
                    strg[j]=0;
            }else{
                int min=Integer.MAX_VALUE;
                for(int i=j;i>=1;i--){
                    if(dp[i][j]){
                        if(strg[i-1]<min){
                            min=strg[i-1]+1;
                        }
                    }
                }

                strg[j]=min;
            }
            
        }
        
        return strg[n-1];
    }
}