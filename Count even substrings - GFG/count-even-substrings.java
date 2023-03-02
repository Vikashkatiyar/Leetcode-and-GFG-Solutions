//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            String S= read.readLine();
            
            Solution ob = new Solution();
            long ans = ob.evenNumSubstring(S);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long evenNumSubstring(String S)
    {
        long ans = 0;
       
       for(int i=0; i<S.length(); i++){
           if(S.charAt(i) % 2 == 0){
               ans += i+1;
           }
       }
       return ans;
    }
}