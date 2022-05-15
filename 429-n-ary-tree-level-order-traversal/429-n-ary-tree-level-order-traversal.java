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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        Queue<Node> q=new ArrayDeque();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            List<Integer> temp=new ArrayList<>();
            while(count-->0){
                Node node=q.poll();
                temp.add(node.val);
                // if(node.children!=null)
                //     q.addAll(node.children);
                for(Node child:node.children){
                    q.add(child);
                }
            }
            res.add(temp);
        }
        return res;
        
    }
}