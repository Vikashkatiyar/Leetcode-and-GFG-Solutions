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
    public List<Integer> rightSideView(TreeNode root) {
    ArrayList<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            int currsize=q.size();
            while(size>0){
                TreeNode head=q.poll();
                if(size==currsize){
                    list.add(head.val);
                }
                
                if(head.right!=null){
                      q.offer(head.right);
                }
                
                if(head.left!=null){
                    q.offer(head.left);
                }
                size--;
            }
        }
        return list;
    }
}