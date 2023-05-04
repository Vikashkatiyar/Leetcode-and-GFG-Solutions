//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] adj = new int[m][3];

            for (int i = 0; i < m; i++) {

                for (int j = 0; j < 3; j++) {
                    adj[i][j] = sc.nextInt();
                }
            }

            int dist = sc.nextInt();
            Solution obj = new Solution();
            int ans = obj.findCity(n, m, adj, dist);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    //jai Baba Bhole
      int findCity(int n, int m, int[][] edges,int distanceThreshold)
      {
          int[][] dist=new int[n][n];
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                  dist[i][j]=Integer.MAX_VALUE;
              }
          }
          
          for(int i=0;i<m;i++){
              int u=edges[i][0];
              int v=edges[i][1];
              int wt=edges[i][2];
              
              dist[u][v]=wt;
              dist[v][u]=wt;
          }
          
          for(int i=0;i<n;i++){
              dist[i][i]=0;
          }
          
          for(int via=0;via<n;via++){
              for(int i=0;i<n;i++){
                  for(int j=0;j<n;j++){
                      if(dist[i][via]==Integer.MAX_VALUE || dist[via][j]==Integer.MAX_VALUE){
                          continue;
                      }
                      dist[i][j]=Math.min(dist[i][j],dist[i][via]+dist[via][j]);
                  }
              }
          }
          
          int maxCount=n;
          int ans=-1;
          for(int city=0;city<n;city++){
              int count=0;
              for(int adCity=0;adCity<n;adCity++){
                  if(dist[city][adCity]<=distanceThreshold){
                      count++;
                  }
              }
              if(count<=maxCount){
                  maxCount=count;
                  ans=city;
              }
          }
          return ans;
      }
}
