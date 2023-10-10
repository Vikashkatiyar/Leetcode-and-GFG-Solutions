//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException
    {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            Solution T = new Solution();
            int target = Integer.parseInt(br.readLine().trim());
            int k = Integer.parseInt(br.readLine().trim());
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = T.KDistanceNodes(root,target,k);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }

class Solution
{
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        distanceKHelper(root, target, k, ans);
        Collections.sort(ans);
        return ans;
    }
    
    //Step 1. calculate all direction nodes at distance k
    public static int distanceKHelper(Node root, int target, int k, ArrayList<Integer> ans){
        if(root==null){
            return -1;
        }
        
        if(root.data==target){
            kDown(root, k-0, null,ans);
            return 1;
        }
        
        int leftDis=distanceKHelper(root.left, target, k, ans);
        if(leftDis!=-1){
            kDown(root, k-leftDis, root.left, ans);
            return leftDis+1;
        }
        
        int rightDis=distanceKHelper(root.right, target, k, ans);
        if(rightDis!=-1){
            kDown(root, k-rightDis, root.right, ans);
            return rightDis+1;
        }
        
        return -1;
    }
    
    //step 2.calculate the down node of the given node at k distnace 
    public static void kDown(Node root, int k, Node blockNode, ArrayList<Integer> ans){
        if(root==null || k<0 || root==blockNode){
            return ;
        }
        
        if(k==0){
            ans.add(root.data);
            return;
        }
        
        kDown(root.left, k-1, blockNode, ans);
        kDown(root.right, k-1, blockNode, ans);
    }
};