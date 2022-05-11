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
    public boolean findTarget(TreeNode root, int k) {
        return TargetSum(root,root,k);
        
    }
    public static boolean find(TreeNode root,int data){
        if(root==null){
            return false;
        }
        
        if(data<root.val){
            return find(root.left,data);
        }
        else if(data > root.val){
            
            return find(root.right,data);
        }
        else{
            return true;
        }
    }
    
    public static boolean  TargetSum(TreeNode root,TreeNode node,int target){
        if(node==null){
            return false;
        }
        boolean Leftres=TargetSum(root,node.left,target);
        int diff=target-node.val;
        if(diff>node.val){
            if(find(root,diff)==true){
                return true;
            }
        }
        boolean rightres=TargetSum(root,node.right,target);
        return Leftres||rightres;
    }
    
}