//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N=sc.nextInt();
                    String S=sc.next();
                        
                    Solution obj = new Solution();
                    
                    
                    System.out.println(obj.CountPS(S,N));
                    
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountPS(String s, int N)
    {
        boolean [][]dp=new boolean[s.length()][s.length()];
        int count=0;
        
        for(int g=0;g<dp.length;g++){
            for(int i=0,j=g;j<dp[0].length;i++,j++){
                if(g==0){
                    dp[i][j]=true;
                }else if(g==1){
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                        if(dp[i][j]==true){
                        count++;
                    }
                }else{
                    dp[i][j]=s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
                        if(dp[i][j]==true){
                        count++;
                    }
                }
                
                
            }
        }
        return count;
    }
}