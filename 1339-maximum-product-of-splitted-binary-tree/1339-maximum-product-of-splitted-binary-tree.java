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
    long maxValue=0;
    long totalSum=0;
    public int maxProduct(TreeNode root) {
        totalSum+=findSum(root);
        helper(root);
        return (int)(maxValue%1000000007);
    }
    
    public int findSum(TreeNode root){ // this function is not requires
        if(root==null){
            return 0;
        }
        return findSum(root.left)+findSum(root.right)+root.val;
    }
    
    public long helper(TreeNode root){ // this function also give me the totalSum
        if(root==null){
            return 0;
        }
        
        long leftSm=helper(root.left);
        long rightSm=helper(root.right);
        
        long tempVal=leftSm+rightSm+root.val;
        
        maxValue=Math.max(maxValue,tempVal*(totalSum-tempVal));//from Hint
        return tempVal;
    }
}