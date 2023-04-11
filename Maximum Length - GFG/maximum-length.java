//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    }
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 
    
class GFG {
    public static void main(String args[]) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
    
            Solution ob = new Solution();
            int ans = ob.solve(a, b, c);
            
            out.println(ans);
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int solve(int a, int b, int c) {
        // if(a>=b && a>=c){
        //     int half_a=(a%2==0?a/2:a/2+1);
        //     int req=half_a-1;
        //     if(b+c>=req){
        //         return a+b+c;
        //     }
        // }
        // if(b>=a && b>=c){
        //   int half_b=(b%2==0?b/2:b/2+1);
        //     int req=half_b-1;
        //     if(a+c>=req){
        //         return a+b+c;
        //     }  
        // }
        
        // if(c>=a && c>=b){
        //   int half_c=(c%2==0?c/2:c/2+1);
        //     int req=half_c-1;
        //     if(b+a>=req){
        //         return a+b+c;
        //     } 
        // }
        
        int sum=a+b+c;
        int max=Math.max(a,Math.max(b,c));
        int maxHalf=(max%2==0)?max/2:max/2+1;
        int req=maxHalf-1;
        if(sum-max>=req){
            return sum;
        }
        return -1;
    }
};