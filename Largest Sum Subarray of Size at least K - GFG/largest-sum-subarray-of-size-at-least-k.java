//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Compute obj = new Compute();
            System.out.println(obj.maxSumWithK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        //kadane's
        long [] res=new long[a.length];
        long csum=a[0];
        res[0]=csum;
        for(int i=1;i<a.length;i++){
            if(csum>0){
                csum=csum+a[i];
            }else{
                csum=a[i];
            }
            res[i]=csum;
        }
        
        long []win=new long[(int)n-(int)k+1];
        for(int i=0;i<k;i++){
            win[0]=win[0]+a[i];
        }
        
        for(int i=1;i<win.length;i++){
            win[i]=win[i-1]-a[i-1]+a[i+(int)k-1];
        }
        
        long ans=0+win[0];
        for(int i=0;i<win.length-1;i++){
            ans=Math.max(ans,Math.max(win[i+1],res[i]+win[i+1]));
        }
        return ans;
    }
}