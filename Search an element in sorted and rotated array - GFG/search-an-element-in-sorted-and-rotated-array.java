//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int Search(int array[], int target)
	{
	    int l = 0 , r = array.length-1;

        while(l<=r) {

         int mid = l + (r-l)/2;

         if(array[mid]==target) return mid;

         if(array[l]<=array[mid]) { // left side sorted

             if(target>=array[l] && target<array[mid]) { // left side present

                 r = mid - 1;

             } else {

                 l = mid +1; // right side present

             }

         } else { // right side present

             if(target>array[mid] && target<=array[r]) {

                 l = mid + 1; // right side present

             } else {

                 r = mid - 1; // left side present

             }

         }

     }

     return -1;
	}
} 

