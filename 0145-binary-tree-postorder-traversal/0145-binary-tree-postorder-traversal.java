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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        
        if(root==null){
            return list;
        }
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        
        st1.add(root);
        while(!st1.isEmpty()){
            TreeNode rem=st1.pop();
            st2.add(rem);
            
            if(rem.left!=null){
                st1.add(rem.left);
            }
            
            if(rem.right!=null){
                st1.add(rem.right);
            }
        }
        
        while(!st2.isEmpty()){
            list.add(st2.pop().val);
        }
        
        return list;
    }
}