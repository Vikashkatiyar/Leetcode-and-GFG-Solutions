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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
      List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        LinkedList<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> level=new ArrayList<Integer>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                level.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                    
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                
            }
            list.add(level);
            
        }
        return list;
    }
}