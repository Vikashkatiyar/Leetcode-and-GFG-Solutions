//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int b = Integer.parseInt(in.readLine());
            String N = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.decimalEquivalent(N, b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Jai Baba Bhole
    static int getInteger(char ch){
        if(ch>='0' && ch<='9'){
            return ch-'0';
        }
        return ch-'A'+10;
    }
    static int decimalEquivalent(String N, int b)
    {
            int res=0,power=1;
            
            for(int i=N.length()-1 ;i>=0 ;i--){
                char ch=N.charAt(i);
                int val=getInteger(ch);
                
                if(val>=b){
                    return -1;
                }
                
                res=res+power*val;
                power=power*b;
            }
            
            return res;
    }
}