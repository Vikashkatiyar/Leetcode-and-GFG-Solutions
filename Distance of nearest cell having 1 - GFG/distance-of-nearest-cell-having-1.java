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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int[][] nearest(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        
        Queue<Pair> q=new LinkedList<>();
        int[][] vis=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new Pair(i,j));
                    vis[i][j]=0;
                }else{
                    vis[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        
        while(!q.isEmpty()){
            Pair rem=q.remove();
            
            for(int i=0;i<4;i++){
                int remRow=rem.row+dir[i][0];
                int remCol=rem.col+dir[i][1];
                
                if(remRow>=0 && remCol>=0 && remRow<n && remCol<m && vis[remRow][remCol]==Integer.MAX_VALUE){
                    vis[remRow][remCol]=vis[rem.row][rem.col]+1;
                    q.add(new Pair(remRow,remCol));
                }
            }
        }
        
        return vis;
        
    }
}