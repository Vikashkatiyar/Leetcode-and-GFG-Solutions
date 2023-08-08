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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
            TreeNode rem=st.pop();
            
            if(rem.right!=null){
                st.push(rem.right);  
            }
            
            if(rem.left!=null){
                st.push(rem.left);
                
            }
            
            list.add(rem.val);
        }
        
        return list;
    }
}