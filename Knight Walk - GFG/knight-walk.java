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
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends


class Solution
{
class Pair{
        int row;
        int col;
        int dist;
        Pair(int row,int col,int dist){
            this.row=row;
            this.col=col;
            this.dist=dist;
        }
    }
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        
        if(KnightPos[0]-1==TargetPos[0]-1 && KnightPos[1]-1==TargetPos[1]-1){
                return 0;
        }
        int [] dx={-2, -1, 1, 2, -2, -1, 1, 2};
        int [] dy={-1, -2, -2, -1, 1, 2, 2, 1};
        
        Queue<Pair> q=new LinkedList<>();
        boolean[][] vis=new boolean[N][N];
        
        q.add(new Pair(KnightPos[0]-1,KnightPos[1]-1,0));
        vis[KnightPos[0]-1][KnightPos[1]-1]=true;
        
        while(q.size()>0){
            Pair rem=q.remove();
            int row=rem.row;
            int col=rem.col;
            int dist=rem.dist;
            
            if(row==TargetPos[0]-1 && col==TargetPos[1]-1){
                return dist;
            }
            
            for(int i=0;i<8;i++){
                int nRow=row+dx[i];
                int nCol=col+dy[i];
                
                if(nRow>=0 && nCol>=0 && nRow<N && nCol<N && vis[nRow][nCol]==false){
                    vis[nRow][nCol]=true;
                    q.add(new Pair(nRow,nCol,dist+1));
                }
            }
        }
        return -1;
    }
}