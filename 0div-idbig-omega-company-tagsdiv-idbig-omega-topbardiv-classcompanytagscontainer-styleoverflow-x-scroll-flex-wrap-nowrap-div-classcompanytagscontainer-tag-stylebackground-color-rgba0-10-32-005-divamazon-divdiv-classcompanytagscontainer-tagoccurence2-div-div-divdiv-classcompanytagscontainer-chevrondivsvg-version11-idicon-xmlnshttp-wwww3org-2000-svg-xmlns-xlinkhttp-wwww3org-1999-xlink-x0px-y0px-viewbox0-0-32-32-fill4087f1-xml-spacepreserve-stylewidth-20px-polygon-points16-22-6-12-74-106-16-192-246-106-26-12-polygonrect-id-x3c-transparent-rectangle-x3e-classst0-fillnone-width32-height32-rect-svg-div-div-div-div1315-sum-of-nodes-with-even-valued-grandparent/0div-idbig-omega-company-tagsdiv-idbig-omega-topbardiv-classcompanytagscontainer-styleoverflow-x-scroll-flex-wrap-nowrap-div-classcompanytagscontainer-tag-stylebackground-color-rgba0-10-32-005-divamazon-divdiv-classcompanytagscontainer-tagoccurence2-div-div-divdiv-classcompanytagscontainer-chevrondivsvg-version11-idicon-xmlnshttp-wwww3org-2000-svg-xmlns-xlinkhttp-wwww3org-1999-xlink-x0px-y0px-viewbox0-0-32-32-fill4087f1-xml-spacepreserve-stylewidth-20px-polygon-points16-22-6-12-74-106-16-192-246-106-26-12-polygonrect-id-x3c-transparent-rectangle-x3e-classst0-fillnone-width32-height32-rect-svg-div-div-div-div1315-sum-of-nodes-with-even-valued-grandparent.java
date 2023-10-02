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
    public int sumEvenGrandparent(TreeNode root) {
        sumEvenGrandparent(root,null,null);
        return sum;
    }
    
    private void sumEvenGrandparent(TreeNode curr, TreeNode parent, TreeNode gdParent){
        if(curr==null){
            return;
        }
        
        if(gdParent!=null && gdParent.val%2==0){
            sum+=curr.val;
        }
        sumEvenGrandparent(curr.left, curr,parent);
        sumEvenGrandparent(curr.right,curr, parent);
    }
}