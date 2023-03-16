//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static void getComponenet(ArrayList<ArrayList<Integer>> graph,int src,boolean [] visited){
        //mark to be visted
        visited[src]= true;
        //call for neighbours
        for(int nbr:graph.get(src)){
            if(visited[nbr]==false){
                getComponenet(graph,nbr,visited);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // create a graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i =0;i<adj.size();i++){
            graph.add(new ArrayList<>());
        }
        for(int i =0;i<adj.size();i++){
            for(int j =0;j<adj.get(i).size();j++){
                if(adj.get(i).get(j)==1){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        
        
        int count = 0;
        //create a boolean visited array to track the record of visited vertices
        boolean [] visited = new boolean[V];
        for(int i =0;i<V;i++){
            //call getComponenet for non-visited vertices
            if(visited[i]==false){
                getComponenet(graph,i,visited);
                //the number of non-visited vertices are equal to number of components
                count++;
            }
        }
        return count;
    }
};