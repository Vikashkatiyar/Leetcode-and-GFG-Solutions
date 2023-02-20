//{ Driver Code Starts
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
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]!=true && grid[i][j]=='1'){
                    count++;
                    getLands(grid,i,j,vis);
                }
            }
        }
        return count;
    }
    
    public void getLands(char [][]grid ,int row,int col,boolean[][] vis){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || vis[row][col] || grid[row][col]=='0' ){
            return;
        }
        
        
        int[] dX={-1,-1,0,1,1,1 ,0,-1 };
        int[] dY={ 0 ,1,1,1,0,-1,-1,-1 };
        
        vis[row][col]=true;
        for(int i=0;i<8;i++){
            getLands(grid,row+dX[i],col+dY[i],vis);
        }
            
        
    }
}