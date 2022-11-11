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
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution {
    static int findMaxLen(String S) {
        // code here
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int maxLen=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.size()==0){
                    st.push(i);
                }else{
                    maxLen=Math.max(maxLen,i-st.peek());
                }
            }
        }
        return maxLen;
    }
};