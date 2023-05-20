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
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends



class Solution
{    
    //Jai Baba Bhole
    class Pair{
        int r;
        int c;
        public Pair(int r,int c){
            this.r=r;
            this.c=c;
        }
    }
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        
        Queue<Pair> q=new LinkedList<>();
        boolean[][] vis=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new Pair(i,j));
                    vis[i][j]=true;
                }
            }
        }
        
        int[] dr={-1,+1,0,0};
        int[] dc={0,0,-1,+1};
        
        
        while(q.size()!=0){
            Pair rem=q.remove();
            int row=rem.r;
            int col=rem.c;
            
            for(int i=0;i<4;i++){
                int nRow=row+dr[i];
                int nCol=col+dc[i];
                
                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && grid[nRow][nCol]!=0 && vis[nRow][nCol]==false){
                    if(grid[nRow][nCol]==2){
                        return true;
                    }
                    q.add(new Pair(nRow,nCol));
                    vis[nRow][nCol]=true;
                }
            }
        }
        
        return false;
        
    }
}