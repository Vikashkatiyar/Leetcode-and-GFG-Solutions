//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int[][] edge = new int[m][2];
            for(int i=0;i<m;i++){
                edge[i][0]=sc.nextInt();
                edge[i][1]=sc.nextInt();
            }
            int src=sc.nextInt();
            Solution obj = new Solution();
            int res[] = obj.shortestPath(edge,n,m,src);
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    //Jai Bhole
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        
        //make adjacenecy List
        ArrayList<ArrayList<Integer>> gList=new ArrayList<>();
        int []dist=new int[n];
        for(int i=0;i<n;i++){
            dist[i]=Integer.MAX_VALUE;
            gList.add(new ArrayList<>());
        }
        
        for(int i=0;i<m;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            
            gList.get(u).add(v);
            gList.get(v).add(u);
        }
        
        //mark src=0
        dist[src]=0;
        
        
        LinkedList<Integer> q=new LinkedList<>();
        q.addLast(src);
        
        //Simple BFS
        while(q.size()>0){
            int rem=q.removeFirst();
            
            for(int nbr:gList.get(rem)){
                if(dist[rem]+1<dist[nbr]){ //Update the distance Array
                    dist[nbr]=dist[rem]+1;
                    q.add(nbr);
                }
            }
        }
        
        
        for(int i=0;i<n;i++){
            if(dist[i]==Integer.MAX_VALUE){
                dist[i]=-1;
            }
        }
        
        return dist;
    }
}