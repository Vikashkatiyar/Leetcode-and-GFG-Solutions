//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
    static int distance(int X,int Y){
        
        //if you try to draw the tree which is talked about in this problem, 
        //you will find that if you divide any node value by 2, 
        //you will reach to its parent node  [Heap property], 
        //because this is a complete binary tree.


        int dist=0;
        if(X==Y){
            return dist;
        }
        
        while(X!=Y){
            if(X>Y){
                X/=2;
            }else{
                Y/=2;
            }
            dist++;
        }
        
        return dist;
        
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int X = Integer.parseInt(S[0]);
            int Y = Integer.parseInt(S[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.distance(X,Y));
        }
    }
}
// } Driver Code Ends