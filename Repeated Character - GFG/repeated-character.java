// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution
{
    char firstRep(String S)
    {
        for(int i = 0;i<S.length()-1;i++)
        {
            if(S.substring(i+1,S.length()).contains(""+S.charAt(i))) 
               return S.charAt(i);
        }
        return '#';
    }
}