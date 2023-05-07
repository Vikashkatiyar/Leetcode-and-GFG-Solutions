//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String str;
            str = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.stringMirror(str);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String stringMirror(String str) {
        StringBuilder temp=new StringBuilder();
        temp.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)<temp.charAt(i-1)){
                temp.append(str.charAt(i));
            }else if(str.charAt(i)== temp.charAt(i-1) && i!=1){
                temp.append(str.charAt(i));
            }else{
                break;
            }
        }
        
        StringBuilder sb=new StringBuilder(temp).reverse();
        temp.append(sb);
        
        return temp.toString();
        
    }
}
        
