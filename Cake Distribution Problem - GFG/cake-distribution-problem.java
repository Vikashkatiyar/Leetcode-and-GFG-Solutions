//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int [] sweetness = new int[n];
			str = br.readLine().trim().split(" ");
			int i = 0;
			for(String s: str) {
				sweetness[i++] = Integer.parseInt(s);
			}
			Solution obj = new Solution();
			System.out.println(obj.maxSweetness(sweetness, n, k));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Jai Baba Bhole
	int maxSweetness(int [] arr, int N, int K) {
	   int start=Integer.MAX_VALUE;
	   int end=0;
	   for(int num:arr){
	       start=Math.min(start,num);
	       end=end+num;
	   }
	   
	   return binarySearch(arr,start,end,K);
	}
	
	int binarySearch(int[] arr,int start,int end,int K){
	    int ans=0;
	    while(start<=end){
	        int mid=start+(end-start)/2;
	        //System.out.println("mid is --> "+mid);
	        if(isValidCut(arr,mid,K)){
	            start=mid+1;
	            ans=mid;
	        }else{
	            end=mid-1;
	        }
	    }
	    
	    return ans;
	}
	
	boolean isValidCut(int[] arr,int totalSum,int K){
	    int cut=0;
	    int sum=0;
	    for(int num:arr){
	        sum+=num;
	        if(sum>=totalSum){
	            cut++;
	            sum=0;
	        }
	    }
	    return cut>=K+1;
	}
}