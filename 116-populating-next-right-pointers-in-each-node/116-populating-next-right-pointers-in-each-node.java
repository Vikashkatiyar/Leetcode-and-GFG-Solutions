/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node nextRight=null;
            int counter=q.size();
            while(counter-->0){
                Node head=q.poll();
                head.next=nextRight;
                nextRight=head;
                
                if(head.right!=null){
                    q.offer(head.right);
                }
                
                if(head.left!=null){
                    q.offer(head.left);
                }
            }
            
        }
        return root;
    }
}