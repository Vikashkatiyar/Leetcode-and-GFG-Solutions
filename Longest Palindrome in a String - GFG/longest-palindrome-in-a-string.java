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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String s){
        boolean [][]dp=new boolean[s.length()][s.length()];
        String ans="";
        for(int g=0;g<dp.length;g++){
            for(int i=0,j=g;j<dp[0].length;i++,j++){
                if(g==0){
                    dp[i][j]=true;
                }
                else if(g==1){
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                }
                else{
                    dp[i][j]=s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
                }
                
                
                if(dp[i][j]==true){
                    if(ans.length()<s.substring(i,j+1).length()){
                        ans=s.substring(i,j+1);
                    }
                    
                }
            }
        }
        return ans;
    }
}