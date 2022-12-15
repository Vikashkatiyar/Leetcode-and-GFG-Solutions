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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
       //Find the smallest String
       String small=arr[0];
       for(String s:arr){
           if(s.length()<small.length()){
               small=s;
           }
       }
       
       for(int i=0;i<n;i++){
           while(arr[i].indexOf(small)!=0){//if small is not meet in arr[i] then check
           //removing the last charcter of small may be present
               small=small.substring(0,small.length()-1);
           }
       }
       
       return small.length()>0?small:"-1";
    }
}