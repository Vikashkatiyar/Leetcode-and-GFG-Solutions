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
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long substrCount (String S, int K) {
        return atMost(S,K)-atMost(S, K-1);
    }
    
    long atMost(String s, int k){
        int[] arr=new int[26];
        int left=0,dist=0;
        long res=0;
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            if(arr[s.charAt(i)-'a']==1){
                dist++;
            }
            
            while(dist>k){
                arr[s.charAt(left)-'a']--;
                if(arr[s.charAt(left)-'a']==0){
                    dist--;
                }
                left++;
            }
            
            res=res+(i-left+1);
        }
        return res;
    }
}