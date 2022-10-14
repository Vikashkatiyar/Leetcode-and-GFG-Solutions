//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            int key = sc.nextInt();
            
            System.out.println(new Solution().search(A, 0, n - 1, key));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int nums[], int l, int h, int target)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>nums[hi]){
                lo=mid+1;
            }else{
                hi=mid;            }
        }
        
        int rot=lo;
        
        int s1=binarySearch(nums,0,rot-1,target);
        if(s1!=-1){
            return s1;
        }
        
        int s2=binarySearch(nums,rot,nums.length-1,target);
        return s2;
    }
    public int binarySearch(int[] nums,int lo,int hi,int target){
        
         while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
         }
        
        return -1;
    }
}