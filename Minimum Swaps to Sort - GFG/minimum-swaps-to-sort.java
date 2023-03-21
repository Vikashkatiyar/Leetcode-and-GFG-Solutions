//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //O(nlogn)
    //Function to find the minimum number of swaps required to sort the array.
    
    class Pair implements Comparable<Pair>{
        int val;
        int idx;
        
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        
        public int compareTo(Pair o){
            return this.val-o.val;
        }
        
    }
    public int minSwaps(int nums[])
    {
        Pair[] arr=new Pair[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=new Pair(nums[i],i);
        }
        boolean[] vis=new boolean[nums.length];
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(vis[i]==true || arr[i].idx==i){
                continue;
            }
            
            int clen=0;
            int j=i;
            while(vis[j]==false){
                vis[j]=true;
                clen++;
                j=arr[j].idx;
            }
            
            ans+=(clen-1);
        }
        return ans;
    }
}