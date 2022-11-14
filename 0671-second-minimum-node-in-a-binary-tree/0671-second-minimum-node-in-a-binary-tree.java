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
    
    public int findSecondMinimumValue(TreeNode root) {
        Set<Long> set=new TreeSet<>();
        inorder(root,set);
        
        int idx=0;
        for(long num:set){
            if(idx==1){
                return (int)num;
            }
            idx++;
        }
        return -1;
    }
    
    public void inorder(TreeNode root,Set<Long> set){
        if(root==null){
            return;
        }
        inorder(root.left,set);
        set.add((long)root.val);
        inorder(root.right,set);
    }
    
}
    
     
    