//{ Driver Code Starts
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
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        ArrayList<String> temp=new ArrayList<>();
        helper(0,S, temp, ans);
        return ans;
    }
    static void helper(int idx, String s, ArrayList<String> temp, ArrayList<ArrayList<String>> ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=idx;i<s.length();i++){
            String lstr=s.substring(idx, i+1);
            
            if(isPlaindrome(lstr)){
                temp.add(lstr);
                helper(i+1,s, temp, ans);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    static boolean isPlaindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
};