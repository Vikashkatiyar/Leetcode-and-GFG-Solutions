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
    public boolean isUnivalTree(TreeNode root) {
        
        return preorder( root ,root.val);
    }
    
    public boolean preorder( TreeNode root,int val){
        if(root==null){

        return true;
        }

        
        return root.val==val && preorder(root.left,val)&& preorder(root.right,val);
    }
}