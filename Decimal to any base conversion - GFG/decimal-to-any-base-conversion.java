//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int B=sc.nextInt();
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            String ans  = ob.getNumber(B,N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    
    static char getChar(int n){
        if(n<10) return (char)(n+'0');
        if(n==10) return 'A';
        if(n==11) return 'B';
        if(n==12) return 'C';
        if(n==13) return 'D';
        if(n==14) return 'E';
        else return 'F';
        
        
    }
    static String getNumber(int B, int N){
        StringBuilder res=new StringBuilder();
        
        while(N!=0){
            char remainder=getChar(N%B);
            res.append(remainder);
            N=N/B;
        }
        
        return res.reverse().toString();
    }
}