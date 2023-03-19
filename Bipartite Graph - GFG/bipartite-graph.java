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
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    
    class Pair{
           int v;
           int level;

           Pair(int v ,int level){
               this.v=v;//for vertex
               this.level=level;
           }
       }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adjList)
    {
        
        //logic to check Bipertite
        int []vis=new int[V];
        Arrays.fill(vis,-1);
        
        
        for(int v=0;v<V;v++){
            if(vis[v]==-1){
                boolean visit=checkBiperpiteness(adjList,v,vis);
                if(visit==false){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean checkBiperpiteness(ArrayList<ArrayList<Integer>> graph,int src,int[] vis){
        ArrayDeque<Pair> q=new ArrayDeque<>();
        q.add(new Pair(src,0));
        
        // r m* w ad*
        
        while(q.size()>0){
            //remove
            Pair rem=q.remove();
            
            
            //mark*
            if(vis[rem.v]!=-1){
                if(vis[rem.v]!=rem.level){
                    return false;
                }
            }else{
                vis[rem.v]=rem.level;
            }
            
            
            
            //add neigh*
            for(Integer e:graph.get(rem.v)){
                if(vis[e]==-1){
                    q.add(new Pair(e,rem.level+1));
                }
            }
            
        }
        
        return true;
        
    }
}