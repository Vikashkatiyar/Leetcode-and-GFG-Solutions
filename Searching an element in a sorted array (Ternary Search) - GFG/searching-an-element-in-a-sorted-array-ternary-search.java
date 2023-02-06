//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");
            
            int N = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);
            
            int arr[] = new int[N];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < N; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.ternarySearch(arr, N, K));
        }
    }
}
// } Driver Code Ends



class Solution{
    // O(lon3n)

    static int ternarySearch(int arr[], int N, int K)
    {
        int l=0;
        int r=N-1;
        while(l<=r){
            int mid1=l+(r-l)/3;
            int mid2=r-(r-l)/3;
            if(arr[mid1]==K || arr[mid2]==K){
                return 1;
            }else if(arr[mid1]>K){
                r=mid1-1;
            }else if(arr[mid2]<K){
                l=mid2+1;
            }else{
                l=mid1+1;
                r=mid2-1;
            }
        }
        return -1;
    }
}