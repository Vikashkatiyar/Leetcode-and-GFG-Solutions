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
    public int maxLevelSum(TreeNode root) {
       
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int sum=Integer.MIN_VALUE;
        int level=0;
        int minLevel=0;
        while(q.size()!=0){
            int size=q.size();
            level++;
            int tempSum=0;
            for(int i=0;i<size;i++){
                TreeNode currNode=q.poll();
                tempSum+=currNode.val;
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
            if(tempSum>sum){
                sum=tempSum;
                minLevel=level;
            }
            
        }
        return minLevel;
    }
}