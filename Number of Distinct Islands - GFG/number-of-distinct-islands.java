//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    StringBuilder psf=new StringBuilder(); 
    int countDistinctIslands(int[][] grid) {
        
       HashSet<String> set=new HashSet<>();
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
               if(grid[i][j]==1){
                   psf=new StringBuilder();
                   psf.append("x");
                   helperDfs(grid,i,j);
                   set.add(psf.toString());
               }
           }
       }
       return set.size();
    }

    public void helperDfs(int[][] grid,int row, int col){
        grid[row][col]=0;

        if(row-1>=0 && grid[row-1][col]==1){
            psf.append("u");
            helperDfs(grid, row-1, col);
        }

        if(col+1 < grid[0].length && grid[row][col+1]==1){
            psf.append("r");
            helperDfs(grid, row, col+1);
        }

        if(row+1<grid.length  && grid[row+1][col]==1){
            psf.append("d");
            helperDfs(grid, row+1, col);
        }

        if(col-1>=0 && grid[row][col-1]==1){
            psf.append("l");
            helperDfs(grid, row, col-1);
        }

        psf.append("b");
    }
}
