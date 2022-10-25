//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int n = sc.nextInt();

    		System.out.println (new Sol().getCount (s, n)); 
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int getCount (String s, int N)
    {
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(char ch:S.toCharArray()){
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }
        // int count=0;
        // for(char ch:map.keySet()){
        //     if(map.get(ch)==N){
        //         count++;
        //     }
        // }
        // return count;
        
        int[] arr = new int[26];
        char prev = '#';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (prev != ch) {
                arr[ch - 'a']++;
            }
            prev = ch;
        }
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == N) {
                count++;
            }
        }
        return count;
    }
}