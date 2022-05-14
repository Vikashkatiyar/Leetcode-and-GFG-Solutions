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
    
    
    public int preorder(TreeNode root,int lo,int hi){
        if(root==null){
            return 0;
        }
        int sum=0;
        if(root.val>=lo && root.val<=hi){
              sum+=root.val;
        }
        
          sum+=preorder(root.left,lo,hi);
       
           sum+=preorder(root.right,lo,hi);
        return sum;
            
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
         int ans=preorder( root,low,high);
        return ans;
    }
}