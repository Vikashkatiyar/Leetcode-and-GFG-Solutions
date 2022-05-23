// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> out= new ArrayList<Integer>();
        Arrays.sort(arr);
        int l=-1;
        for(int i=1;i<n;i++){
         if(arr[i-1]==arr[i] && l!=arr[i]){
             
                out.add(arr[i]);
                l=arr[i];
            
         }   
       }    
       if(out.size()==0){
           out.add(-1);
       }
       return out;
    }
}
