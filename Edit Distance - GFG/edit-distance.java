//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public int editDistance(String s, String t) {
       return minDistance(s,t);
    }
    public int minDistance(String word1, String word2) {
         int n=word1.length();
         int m=word2.length();
        
        int[][] dp=new int[n+1][m+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0){
                    dp[i][j]=j;
                }else if(j==0){
                    dp[i][j]=i;
                }else{
                    if(word1.charAt(i-1) == word2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1];
                    }else{
                        int replace=1+dp[i-1][j-1] ;
                        int delete=1+dp[i-1][j];
                        int insert=1+dp[i][j-1];
                        
                        dp[i][j]=Math.min(replace,Math.min(delete,insert));
                    }
                }
            }
        }
        
        return dp[n][m];
    }
}