//{ Driver Code Starts
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}



class CompleteBT{
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root){
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
    
    
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
		while(t-->0){
			String s = br.readLine();
	    	Node root = buildTree(s);
			GfG g=new GfG();
			boolean a=g.isCompleteBT(root);
			if(a==true)
				System.out.println("Complete Binary Tree");
			else
				System.out.println("Not Complete Binary Tree");
		}
	}
	
}

// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class GfG
{
	boolean isCompleteBT(Node root)
    {
        //Jai Shree Ram
          Queue<Node> q=new LinkedList<>();
          q.add(root);
          boolean flag=false;
          
          while(!q.isEmpty()){
              int size=q.size();
              
              while(size-->0){
                  Node rem=q.remove();
                  
                  if(rem==null){
                      flag=true;
                  }else{
                      if(flag){
                          return false;
                      }
                      q.add(rem.left);
                      q.add(rem.right);
                  }
              }
          }
          
          return true;
	} 
}