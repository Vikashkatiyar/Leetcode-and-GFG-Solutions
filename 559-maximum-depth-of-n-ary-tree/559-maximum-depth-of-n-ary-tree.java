/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null){
            return 0;     
        }
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int count=q.size();
            while(count-->0){
                Node temp=q.poll();
                for(Node n: temp.children)
                     q.offer(n);

            }
            level++;
            
            
        }
        return level;
    }
}






// if (root == null) return 0;
//         int max = 0;
//         for (Node child : root.children)
//             max = Math.max(max, maxDepth(child));
//         return max +1;