//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());

            int start[] = new int[N];
            int end[] = new int[N];

            String inputLine2[] = br.readLine().trim().split(" ");
            String inputLine3[] = br.readLine().trim().split(" ");
            
            for (i = 0; i < N; i++) {
                start[i] = Integer.parseInt(inputLine2[i]);
                end[i] = Integer.parseInt(inputLine3[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.minLaptops(N, start, end));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int minLaptops(int N, int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        int ans=1,i=0,j=0,c=0;
        while(i<start.length && j<end.length){
            if(start[i]<end[j]){
                i++;
                c++;
            }else{
                j++;
                c--;
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}