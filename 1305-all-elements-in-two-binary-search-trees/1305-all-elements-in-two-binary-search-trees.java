/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    PriorityQueue<Integer> pq= new PriorityQueue<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res=new ArrayList<>();
        if(root1==null && root2==null){
            return res;
        }
        inorder(root1);
        inorder(root2);
        
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        return res;
    }
    
    public void inorder(TreeNode root){
        if(root==null)
            return;
        
        inorder(root.left);
        pq.offer(root.val);
        inorder(root.right);
    }
}