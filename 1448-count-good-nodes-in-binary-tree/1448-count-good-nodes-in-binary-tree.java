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
    int size=0;
    public int goodNodes(TreeNode root) {
         numNodes(root, Integer.MIN_VALUE);
        return size;
    }
    public void numNodes(TreeNode root, int max){
    if(root == null){
        return;
    }
   
    
    if(root.val>=max){
        max=root.val;
        size=size+1;
    }
    numNodes(root.left, max);
    numNodes(root.right, max);
    
 }
}