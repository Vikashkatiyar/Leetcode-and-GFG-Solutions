//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
		    
		    int M = Integer.parseInt(br.readLine());
		    
		    Complete obj = new Complete();
		    arr = obj.sortExceptK(arr, N, M);
        	for (int i = 0; i < N; i++)
        	{
        	    System.out.print(arr[i] + " ");
        	}
        	System.out.println();
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] sortExceptK (int arr[], int n, int k) {
        int ele=arr[k];
        arr[k]=0;
        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            arr[i]=arr[i+1];
        }
        arr[k]=ele;
        return arr;
    }
    
    
}
