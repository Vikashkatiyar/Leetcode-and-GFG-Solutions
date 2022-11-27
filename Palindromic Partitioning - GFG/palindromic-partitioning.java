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
    //O(n3)  Solution MCM group question
    static int palindromicPartition(String str)
    {
        int [][] dp=new int[str.length()][str.length()];
        
        for(int g=0;g<dp.length;g++){
            for(int i=0,j=g;j<dp[0].length;i++,j++){
                if(g==0){
                    dp[i][j]=0;
                }
                else if(g==1){
                    dp[i][j]=(str.charAt(i)==str.charAt(j))?0:1;
                }
                else{
                    if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]==0){
                        dp[i][j]=0;
                    }
                    else{
                        dp[i][j]=Integer.MAX_VALUE;
                        for(int lk=g,rk=1;lk>=1;lk--,rk++){
                            int left=dp[i][j-lk];
                            int right=dp[i+rk][j];
                            dp[i][j]=Math.min(dp[i][j],left+right+1);
                        }
                    }
                }
            }
        }
        return dp[0][dp[0].length-1];
    }
}