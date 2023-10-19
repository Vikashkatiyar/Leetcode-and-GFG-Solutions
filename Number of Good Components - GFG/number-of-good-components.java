//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int E = Integer.parseInt(s[0]);
            int V = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i <= V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            int ans = obj.findNumberOfGoodComponent(V, adj);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findNumberOfGoodComponent(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean [] vis=new boolean[V+1];
       int countComp=0;
       
       for(int i=1;i<=V;i++){
           
           if(!vis[i]){
               int [] nodes=new int[1];
               int [] edges=new int[1];
               dfs(i, vis, adj, nodes, edges);
               if(edges[0]/2==nodes[0]*(nodes[0]-1)/2){  //for checking the cycle
                   countComp++;
               }
           }
       }
       
       return countComp;
    }
    
    private void dfs(int node,boolean[] vis,  ArrayList<ArrayList<Integer>> adj, int[] nodes, int[] edges ){
        vis[node]=true;
        nodes[0]++;
        
        for(int nbr: adj.get(node)){
            edges[0]++;
            if(!vis[nbr]){
                dfs(nbr, vis, adj, nodes, edges);
            }
        }
    }
}