//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static class Pair implements Comparable<Pair> {
        int v;
        int wt;
        Pair(int v,int wt){
            this.v=v;
            this.wt=wt;
        }
        
        public int compareTo(Pair that){
            return this.wt-that.wt;
        }
    }
	static int spanningTree(int V, int E, int edges[][]){
	    List<List<Pair>> adjList=buildGraph(V,edges);
	    PriorityQueue<Pair> pq=new PriorityQueue<>();
	    pq.add(new Pair(0,0));
	    int ans=0;
	    boolean[] vis=new boolean[V];
	    
	    while(pq.size()>0){
	        Pair rem=pq.poll();
	        if(vis[rem.v]){
	            continue;
	        }
	        
	        ans+=rem.wt;
	        vis[rem.v]=true;
	        
	        for(Pair nbr: adjList.get(rem.v)){
	            if(vis[nbr.v]==false){
	                pq.add(new Pair(nbr.v,nbr.wt));
	            }
	        }
	    }
	    return ans;
	}
	
	static List<List<Pair>> buildGraph(int V,int[][] edges){
	    List<List<Pair>> adjList=new ArrayList<>();
	    for(int i=0;i<V;i++){
	        adjList.add(new ArrayList<>());
	    }
	    
	    for(int i=0;i<edges.length;i++){
	        int a=edges[i][0];
	        int b=edges[i][1];
	        int w=edges[i][2];
	        
	        adjList.get(a).add(new Pair(b,w));
	        adjList.get(b).add(new Pair(a,w));
	    }
	    
	    return adjList;
	}
}