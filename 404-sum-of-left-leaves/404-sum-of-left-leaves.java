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
    private int total=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        helper(root,false);
        return total;
    }
    public void helper(TreeNode root,boolean b){
        if(root==null)
            return ;
        if(b && root.left==null && root.right==null){
            total+=root.val;
            return ;
        }
        helper(root.left,true);
        helper(root.right,false);
    }
}