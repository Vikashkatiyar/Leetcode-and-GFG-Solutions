//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] nums = IntArray.input(br, n);
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.countSubarray(n, nums, k);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int countSubarray(int n, int[] nums, int k) {
        // code here
        return  numberOfSubarraysHelper(nums,k)-numberOfSubarraysHelper(nums,k-1);
    }
    public static int numberOfSubarraysHelper(int[] nums, int k) {
        int n=nums.length;
        int s=0;
        int e=0;
        
        int ans=0;
        int odd=0;
        while(e<n){
            if(nums[e]%2==1){
                odd++;
            }
            
            while(odd>k){
                if(nums[s]%2==1){
                    odd--;
                }
                s++;
            }
            
            ans+=(e-s+1);
            e++;
        }
        
        return ans;
    }
}
        
