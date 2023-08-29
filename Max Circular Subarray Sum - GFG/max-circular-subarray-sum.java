//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}



// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int nums[], int n) {
     int currMax=0,  maxSum=nums[0];
     int currMin=0,  minSum=nums[0];
     int totalSum=0;
        
     for(int num:nums){
        totalSum+=num;

        currMax=Math.max(currMax+num,num);
        maxSum=Math.max(currMax,maxSum);

        currMin=Math.min(currMin+num,num);
        minSum=Math.min(currMin,minSum);
     }

     return maxSum>0?Math.max(maxSum,totalSum-minSum):maxSum ;
    }
    
}

