//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String S = br.readLine();
            Solution ob = new Solution();
            String ans = ob.rremove(S).trim();
            if(ans.length() == 0)
                System.out.println();
            else
                System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String rremove(String s) {
         String ans=helper(s);
        if (ans.length()==0 || ans.length() == s.length()) {
            return ans;
        }
        return rremove(ans);
    }
    String helper(String s){
       StringBuilder sb=new StringBuilder();
       int n=s.length();
       int i=0;
       while(i<n){
           if(i<n-1 && s.charAt(i)==s.charAt(i+1)){
               while(i<n-1 && s.charAt(i)==s.charAt(i+1)){
                   i++;
               }
           }else{
               sb.append(s.charAt(i));
           }
           i++;
       }
       return sb.toString();
    }
}