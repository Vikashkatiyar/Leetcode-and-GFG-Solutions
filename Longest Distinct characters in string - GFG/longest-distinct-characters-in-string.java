//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        HashMap<Character,Integer> map=new HashMap<>();

        

        int j=0;
        int ans=0;

        for(int i=0;i<S.length();i++)

        {
            char ch=S.charAt(i);
            if(map.containsKey(ch)){
                j=Math.max(j,map.get(ch)+1);
                
            }
            ans=Math.max(ans,i-j+1);

            map.put(ch,i);

        }

        return ans;
    }
}