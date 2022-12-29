//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        HashSet<String> dict=new HashSet<>();
        for(String s:B){
            dict.add(s);
        }
        
        int []dp=new int[A.length()];
        for(int i=0;i<dp.length;i++){
            if(dict.contains(A.substring(0,i+1))){
                dp[i]=1;
            }else{
                for(int j=0;j<i;j++){
                    if(dp[j]==1 && dict.contains(A.substring(j+1,i+1))){
                        dp[i]=1;
                    }
                }
            }
        }
        return dp[A.length()-1];
    }
}