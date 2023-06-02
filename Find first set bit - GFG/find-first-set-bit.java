//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public static int logBase2(int x){
        return (int)(Math.log(x)/Math.log(2)) +1;
    }
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        if(n==0){
            return 0;
        }
            
        int rsb=(n&-n);
        return logBase2(rsb);
            
    }
}