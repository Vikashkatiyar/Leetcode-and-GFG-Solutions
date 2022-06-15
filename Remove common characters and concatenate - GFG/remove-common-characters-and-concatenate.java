// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        Set<Character> hs=new HashSet<Character>();
        Set<Character>hss=new HashSet<Character>();
        
        String k="";
        
        for(int i=0;i<s1.length();i++){
            hs.add(s1.charAt(i));
        }
        
        for(int i=0;i<s2.length();i++){
            hss.add(s2.charAt(i));
        }
        
        for(int i=0;i<s1.length();i++){
            if(!(hss.contains(s1.charAt(i)))){
                k+=s1.charAt(i);
            }
        }
        
        for(int i=0;i<s2.length();i++){
            if(!(hs.contains(s2.charAt(i)))){
                k+=s2.charAt(i);
            }
        }
        
        if(k.length()==0){
            String s="-1";
            return s;
        }
        return k;
    
    }
}
