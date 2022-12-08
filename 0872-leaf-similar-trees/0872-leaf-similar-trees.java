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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        
        preorder(root1,l1);
        preorder(root2,l2);
        
        if(l1.size()!=l2.size()){
            return false;
        }
        
        for(int i=0;i<l1.size();i++){
            if(l1.get(i)!=l2.get(i)){
                return false;
            }
        }
        return true;
    }
    
    public void preorder(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            list.add(root.val);
        }
        preorder(root.left,list);
        preorder(root.right,list);
    }
}