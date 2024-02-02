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
    int ans=Integer.MIN_VALUE;
    public int maxSumBST(TreeNode root) {
        helper(root);
        return ans>0 ?ans: 0;
    }
    
    public int[] helper(TreeNode root){
        if(root==null){
            return new int[]{Integer. MAX_VALUE, Integer.MIN_VALUE, 0};
        }
        int[] left=helper(root.left);
        int[] right=helper(root.right);
        
        if(left[1]>= root.val || right[0]<=root.val){
            return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
        } 
        
        int sum=left[2]+root.val+ right[2];
        ans=Math.max(ans, sum);
        
        return new int[]{Math.min(left[0],root.val), Math.max(right[1], root.val), sum};
    }
}