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
    
    public int max(TreeNode root){
        if(root.right!=null){
            return max(root.right);
        }
        else{
             return root.val;
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        
        if(key<root.val){
            root.left=deleteNode(root.left,key);
            // return root;
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
            
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
             if(root.right==null){
                return root.left;
            }
            
            int  lmax=max(root.left);
            root.val=lmax;
            root.left=deleteNode(root.left,lmax);
            
            return root;
        }
        return root;
    }
}