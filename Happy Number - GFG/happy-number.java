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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
  
     static int isHappy(int n) { 
         Set<Integer> set=new HashSet<>();
         
         while(n!=1){
             int temp=n;
             int sum=0;
             
             while(temp!=0){
                 int rem=temp%10;
                 sum+=(rem*rem);
                 temp/=10;
             }
             
             n=sum;
             
             if(set.contains(sum)){
                 return 0;
             }else{
                 set.add(sum);
             }
         }
         
         return 1;
     }
}