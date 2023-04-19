//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.findElement(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Compute {
    public int findElement(int arr[], int n){
        int []pMax=new int[n];
        int []sMin=new int[n];
        
        pMax[0]=arr[0];
        for(int i=1;i<n;i++){
            pMax[i]=Math.max(arr[i],pMax[i-1]);
        }
        
        sMin[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            sMin[i]=Math.min(arr[i],sMin[i+1]);
        }
        
        
        // Note: Left and right side elements can be equal to required element. 
        // And extreme elements cannot be required element.
        for(int i=1;i<n-1;i++){ 
            if(pMax[i]==sMin[i]){
                return arr[i];
            }
        }
        return -1;
    }
}