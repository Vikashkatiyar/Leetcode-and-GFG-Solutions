//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        if(s.length()%2!=0){
            return -1;
        }      
        
        int open = 0,close=0;
         
        for (char c : s.toCharArray()) {
            if (c == '{')
                open++;
            else {
                if (open == 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }
        return (close+1)/2 + (open+1)/2;
        
    }
}