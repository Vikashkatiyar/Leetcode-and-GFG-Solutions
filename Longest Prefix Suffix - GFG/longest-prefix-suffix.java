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
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        int []lps=new int[s.length()];
        int len=0;
        int i=1;
        
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                lps[i]=len+1;
                len++;
                i++;
            }else if(len==0){
                lps[i]=0;
                len=0;
                i++;
            }else{
                len=lps[len-1];
            }
        }
        int k=lps[s.length()-1];
        return k;
    }
}