//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int MOD=1000000007;
    int distinctSubsequences(String str) {
        int[] dp=new int[str.length()+1];
        dp[0]=1;
        
        HashMap<Character,Integer> lo=new HashMap<>();
        for(int i=1;i<dp.length;i++){
            dp[i]=(2*dp[i-1])%MOD;
            
            char ch=str.charAt(i-1);
            if(lo.containsKey(ch)){
                int j=lo.get(ch);
                dp[i]=(dp[i]-dp[j-1]+MOD)%MOD;
            }
            
            lo.put(ch,i);
        }
        
        return dp[dp.length-1]%MOD;
    }
}