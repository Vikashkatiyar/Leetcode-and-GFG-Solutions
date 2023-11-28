//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    class DisjointSet{
        List<Integer> parent=new ArrayList<>();
        List<Integer> size=new ArrayList<>();
        
        public DisjointSet(int n){
            for(int i=0;i<n;i++){
                parent.add(i);
                size.add(1);
            }
        }
        
        public int findPar(int node){
            if(node==parent.get(node)){
                return node;
            }
            
            int ulp=findPar(parent.get(node));
            parent.set(node, ulp);
            return parent.get(node);
        }
        
        public void UnionBySize(int u, int v){
            int ulp_u=findPar(u);
            int ulp_v=findPar(v);
            
            if(ulp_u==ulp_v){
                return;
            }
            
            if(size.get(ulp_u)< size.get(ulp_v)){
                parent.set(ulp_u, ulp_v);
                size.set(ulp_v, size.get(ulp_u)+size.get(ulp_v));
            }else{
                parent.set(ulp_v, ulp_u);
                size.set(ulp_u, size.get(ulp_u)+size.get(ulp_v));
            }
        }
    }
    public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        List<Integer> ans  = new ArrayList<>();
        boolean[] vis = new boolean[rows * cols];
        Arrays.fill(vis, false);
            
        int[] delRow = {-1, 1, 0, 0};
        int[] delCol = {0 ,0, 1, -1};
        
        DisjointSet dsu = new DisjointSet(rows * cols);
        int count = 0;
        
        for(int i=0;i<operators.length;i++){
            int node = (operators[i][0] * cols) + operators[i][1];
            
            if(vis[node] == false){
                vis[node] = true;
                count++;
                
                for(int j=0;j<4;j++){
                    int x = operators[i][0] + delRow[j];
                    int y = operators[i][1] + delCol[j];
                    
                    if(x >= 0 && x < rows && y >= 0 && y < cols){
                        int ngb = (x * cols) + y;
                        
                        if(vis[ngb] == true){
                            if(dsu.findPar(node) != dsu.findPar(ngb)){
                                dsu.UnionBySize(node, ngb);
                                count--;
                            }
                        }
                    }
                }
            }
            ans.add(count);
        }
        
        return ans;
        
        
        
        
    }
    
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int  k= sc.nextInt();
            int[][] a = new int[k][2];
            for(int i=0;i<k;i++){
            
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            List<Integer> ans = obj.numOfIslands(n,m,a);
           
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends