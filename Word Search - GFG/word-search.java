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
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            char [][] board = new char[n][m];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    board[i][j] = s[j].charAt(0);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(board, word);
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
    public boolean isWordExist(char[][] board, String word)
    {
       boolean [][] vis=new boolean[board.length][board[0].length];
       for(int i=0;i<board.length;i++){
           for(int j=0;j<board[0].length;j++){
               if(board[i][j]==word.charAt(0) && searchNextW(board,i,j,word,0,vis)){
                   return true;
               }
           }
       }
       return false;
    }
    
     public boolean searchNextW(char[][] board,int row,int col,String word,int idx,boolean[][] vis){
        if(idx==word.length()){
            return true;
        }

        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]!=word.charAt(idx) || vis[row][col]==true){
            return false;
        }

        vis[row][col]=true;
        if(searchNextW(board,row+1,col,word,idx+1,vis) ||
           searchNextW(board,row-1,col,word,idx+1,vis) ||
           searchNextW(board,row,col+1,word,idx+1,vis) ||
           searchNextW(board,row,col-1,word,idx+1,vis) ){
               return true;
        }
        vis[row][col]=false;



        return false;
           
    }
}