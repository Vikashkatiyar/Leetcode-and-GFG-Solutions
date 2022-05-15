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
    private int totalSum=0;
    public int sumRootToLeaf(TreeNode root) {
        if(root==null)
            return 0;
        helper(root,0);
        return totalSum;
    }
    
    private void helper(TreeNode root,int currsum){
        if(root==null){
            return ;
        }
        
        currsum+=root.val;
        if(root.left==null && root.right==null){
            totalSum+=currsum;
            return;
        }
        helper(root.left,currsum*2);
        helper(root.right,currsum*2);
    }
}