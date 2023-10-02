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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        binaryTreePaths(root,ans,"");
        return ans;
    }
    
    public void binaryTreePaths(TreeNode root,List<String> ans,String psf){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            ans.add(psf+root.val);
        }
        binaryTreePaths(root.left,ans,psf+root.val+"->");
        binaryTreePaths(root.right,ans,psf+root.val+"->");
    }
}