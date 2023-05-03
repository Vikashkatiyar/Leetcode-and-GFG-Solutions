//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.makePalindrome(n, arr);
            
            String _result_val = (res) ? "YES" : "NO";
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        HashSet<String> set=new HashSet<>();
        
        for(String str:arr){
            if(set.contains(str)){
                set.remove(str);
            }else{
                set.add(new StringBuilder(str).reverse().toString());
            }
        }
        
        if(set.size()==0 ){
            return true;
        }
        
        if(set.size()>1){
            return false;
        }
        
        //if set.size()==0
        
        for(String str:set){
            int i=0,j=str.length()-1;
            while(i<j){
                if(str.charAt(i++)!=str.charAt(j--)){
                    return false;
                }
            }
        }
        
        return true;
    }
}
        
