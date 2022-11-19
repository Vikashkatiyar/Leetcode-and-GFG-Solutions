//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] nums , int N, int m) {
       int lo=Integer.MIN_VALUE;
       int hi=0;
       for(int num:nums){
           hi+=num;
           lo=Math.max(lo,num);
       }
       
       while(lo<hi){
           int mid=lo+(hi-lo)/2;
           
           if(isPossible(nums,mid,m)){
               hi=mid;
           }else{
               lo=mid+1;
           }
       }
       return lo;
    }
    
    static boolean isPossible(int []arr,int mid,int m){
        int sum=0;
        int st=1;
        for(int num:arr){
            sum+=num;
            if(sum>mid){
                sum=num;
                st++;
            }
        }
        return st<=m;
    } 
};