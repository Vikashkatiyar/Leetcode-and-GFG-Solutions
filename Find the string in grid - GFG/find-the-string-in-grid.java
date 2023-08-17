//{ Driver Code Starts
//Initial Template for Java

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
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    class Index{
        int row;
        int col;
        
        public Index(){}
        public Index(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int[][] searchWord(char[][] grid, String word)
    {
        int rows = grid.length;
        int cols = grid[0].length;
        
        List<Index> list = new ArrayList<>();
        
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(grid[i][j]==word.charAt(0) && search(grid, i, j, word.toCharArray(), rows, cols, word.length())){
                    list.add(new Index(i, j));
                }
            }
        }
        
        int[][] ans = new int[list.size()][2];
        for(int i = 0 ; i < list.size() ; i++){
            ans[i][0] = list.get(i).row;
            ans[i][1] = list.get(i).col;
        }
        
        return ans;
    }
    
    public boolean search(char[][] grid,int i,int j,char[] word,int rows,int cols, int word_len){
        /*all directions*/
        int[][] directions = {{0,-1},{0,1},{-1,0},{1,0},{-1,-1},{-1,1},{1,-1},{1,1}};
        
        /* Note:- Word is said to be found in a direction if all characters match in this direction (not in zig-zag form) */
        for(int k=0;k<8;k++){
            int di=i;
            int dj=j;
            int idx=0;
            while(idx<word_len && isValid(di,dj,rows,cols) && word[idx]==grid[di][dj]){
                di+=directions[k][0];
                dj+=directions[k][1];
                idx++;
            }
            
            if(idx==word_len){
                return true;
            }
        }
        
        return false;
    }
    
    /*check index validity*/
    public boolean isValid(int i, int j, int rows, int cols){
        if (i < 0 || i >= rows ||  j < 0 || j >= cols) 
            return false;
            
        return true;
    }
}