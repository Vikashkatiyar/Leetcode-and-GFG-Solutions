//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{

    public static String isomorphic(String s){

        HashMap<Character, Integer> map = new HashMap<>();

        StringBuilder str = new StringBuilder("");
        for(int i = 0;i<s.length();i++){

            char ch = s.charAt(i);

            if(map.containsKey(ch)==false){
                   map.put(ch,i);
            }

            str.append(Integer.toString(map.get(ch)));

        }
        return str.toString();

    }
    public static boolean areIsomorphic(String str1,String str2)
    {
       return isomorphic(str1).equals(isomorphic(str2));
        
    }
}