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
    
    public static void inorder(TreeNode root,ArrayList<Integer> list){
       if(root==null){
           return;
       }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    
    
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        inorder( root,list);
        
        if(list.size()==0){
             return null;
        }
       TreeNode temp=new TreeNode(list.get(0));
        root=temp;
        for(int i=1;i<list.size();i++){
            TreeNode curr=new TreeNode(list.get(i));
            temp.right=curr;
            temp.left=null;
            temp=temp.right;
            
             
        }
        return root;
    }
}