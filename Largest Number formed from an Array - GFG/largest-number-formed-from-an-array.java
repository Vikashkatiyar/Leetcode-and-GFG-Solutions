//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
         Arrays.sort(arr,(a,b)->{
            String case1=a+b;
            String case2=b+a;
            return case2.compareTo(case1);
        });
        
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < arr.length; i++){
            str.append(arr[i]);
        }
        return str.toString();
    }
}