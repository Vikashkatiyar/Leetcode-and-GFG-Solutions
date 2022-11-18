//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            int K = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.removeKdigits(S, K));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String removeKdigits(String s, int k) {
        
        if(k==s.length()){
            return "0";
        }
        
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            while(st.size()>0 && k>0 &&ch<st.peek()){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        
        while(k>0){
            st.pop();
            k--;
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
            
        }
        
        //for trimming the leading zeros
        
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)=='0'){
                sb.deleteCharAt(i);
            }else{
                break;
            }
        }
        
        String res=sb.reverse().toString();
        return res.length()>0?res:"0";
    }
}