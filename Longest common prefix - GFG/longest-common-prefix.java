//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String s1 = sc.next();
            String s2 = sc.next();
            Solution obj = new Solution();
            int[] ans=obj.longestCommonPrefix(s1,s2);
            if(ans[0] == -1)
                System.out.println(ans[0]);
            else 
                System.out.println(ans[0]+" "+ans[1]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public int[] findLps(String str){
        int []lps=new int[str.length()];
        int len=0;
        int i=1;
        while(i<str.length()){
            if(str.charAt(i)==str.charAt(len)){
                lps[i]=len+1;
                len++;
                i++;
            }else{
                if(len>0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                    len=0;
                }
            }
        }
        return lps;
    }
    public int[] longestCommonPrefix(String s1, String s2){
         String s=s1+"&"+s2;
         int []lps=findLps(s);
         int max=0;
         for(int i=s1.length()+1;i<lps.length;i++){
             max=Math.max(max,lps[i]);
         }
         return new int[]{0,max-1};
    }
}