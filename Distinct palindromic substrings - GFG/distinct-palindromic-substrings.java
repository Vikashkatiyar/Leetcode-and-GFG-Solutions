//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String str = read.readLine().trim(); 
            Solution obj = new Solution();
            int ans = obj.palindromeSubStrs(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    int palindromeSubStrs(String str) { 
        boolean [][]dp=new boolean[str.length()][str.length()];
        HashSet<String> set=new HashSet<>();
        
        for(int g=0;g<dp.length;g++){
            for(int i=0,j=g;j<dp[0].length;i++,j++){
                if(g==0){
                    dp[i][j]=true;
                }
                else if(g==1)
                {
                    dp[i][j]=str.charAt(i)==str.charAt(j);
                }
                else{
                    dp[i][j]=str.charAt(i)==str.charAt(j)&& 
                                    dp[i+1][j-1];
                }
                
                
                if(dp[i][j]==true){
                    set.add(str.substring(i,j+1));
                }
            }
        }
        return set.size();
    }
} 