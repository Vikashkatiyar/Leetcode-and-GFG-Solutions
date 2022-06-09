// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        long prev0 = 1l, prev1 = 1l;
        for (int i = 2; i <= n; i++) {
            long curr0 = (prev1)% 1000000007l;
            long curr1 = (prev0 + prev1)% 1000000007l;
            prev0 = curr0;
            prev1 = curr1;
        }
         return (prev0+prev1)% 1000000007l;
        
    }
}