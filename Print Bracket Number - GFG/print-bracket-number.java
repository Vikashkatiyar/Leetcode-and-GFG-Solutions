//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            ArrayList<Integer> result = ob.barcketNumbers(S);
            for(int value :  result)
            System.out.print(value + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<Integer> barcketNumbers(String S) {
        Stack<Integer> st=new Stack<>();
        int count=0;
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(Character ch:S.toCharArray()){
            if(ch=='('){
                count++;
                list.add(count);
                st.push(count);
            }
            else if(ch==')'){
                list.add(st.peek());
                st.pop();
                
            }
        }
        return list;
    }
};