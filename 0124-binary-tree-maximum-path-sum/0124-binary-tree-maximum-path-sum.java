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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findH(root);
        return max;
    }
    
    public int findH(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int lh=findH(root.left);
        int rh=findH(root.right);
        
        max=Math.max(max,(lh<0?0:lh)+(rh<0?0:rh)+root.val);
        return root.val+Math.max((lh<0?0:lh),(rh<0?0:rh));
    }
}