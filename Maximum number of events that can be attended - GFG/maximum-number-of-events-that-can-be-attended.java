//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            int[] start = new int[N];
            int[] end = new int[N];
            
            for(int i=0; i<N; i++)
            {
                start[i] = Integer.parseInt(S1[i]);
                end[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxEvents(start,end,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxEvents(int[] start, int[] end, int N) {
        Pair [] arr=new Pair[N];
        for(int i=0;i<N;i++){
            arr[i]=new Pair(start[i],end[i]);
        }
        Arrays.sort(arr);
        
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=1;i<=100000;i++){
            set.add(i);
        }
        
        int ans=0;
        
        for(int i=0;i<N;i++){
            int s=arr[i].s;
            int e=arr[i].e;
            
            int val=set.ceiling(s);
            if(val<=e){
                ans++;
                set.remove(val);
            }
        }
        return ans;
        
    }
    static class Pair implements Comparable<Pair>{
        int s;
        int e;
        
        Pair(int s,int e){
            this.s=s;
            this.e=e;
        }
        
        public int compareTo(Pair p){
            if(this.e==p.e){
                return this.s-p.e;
            }
            return this.e-p.e;
        }
    }
};