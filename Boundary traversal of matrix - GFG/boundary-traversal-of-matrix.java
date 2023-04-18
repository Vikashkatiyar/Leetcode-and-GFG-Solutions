//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int matrix[][] = new int[n][m];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(matrix, n, m);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
       ArrayList<Integer> list=new ArrayList<>();
       if(n==1 || m==1){
           for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                   list.add(matrix[i][j]);
               }
           }
           
       }
       else{
           //1st row
           for(int i=0;i<m;i++){
               list.add(matrix[0][i]);
           }
           
           // last col
           
           for(int i=1;i<n;i++){
               list.add(matrix[i][m-1]);
           }
           
           //last row
           
           for(int i=m-2;i>=0;i--){
               list.add(matrix[n-1][i]);
           }
           
           //first col
           for(int i=n-2;i>=1;i--){
               list.add(matrix[i][0]);
           }
       }
       return list;
    }
}
