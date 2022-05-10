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
    
    
    int sum=0;
    
    public TreeNode bstToGst(TreeNode root) {
       sum=0;
        return bstTOGstHelper(root);
    }
    public TreeNode bstTOGstHelper(TreeNode root){
        if(root==null){
            return null;
        }
        root.right=bstTOGstHelper(root.right);
        
        sum+=root.val;
        root.val=sum;
        
        root.left=bstTOGstHelper(root.left);
        return root;
    }
}