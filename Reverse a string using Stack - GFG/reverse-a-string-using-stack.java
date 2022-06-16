// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}
// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        Stack<Character> st=new Stack<>();
        String nw="";
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        
        while(!st.empty()){
            nw+=st.pop();
        }
        
        return nw;
        
        //  Stack<Character> stack = new Stack<>();
        // // Pushing elements into the stack...
        // for(int i=0;i<S.length();i++){
        //     stack.push(S.charAt(i));
        // }
        // // Initializing empty string to store our answer...
        // String ans = "";
        // // Taking one element and appending it to answer until our stack
        // // becomes empty....
        // while(!stack.empty()){
        //     ans+=stack.pop();
        // }
        // return ans;
    }

}