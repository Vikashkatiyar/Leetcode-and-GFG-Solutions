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
    public List<Double> averageOfLevels(TreeNode root) {
     List<Double> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            double sum=0.0;
            int count=q.size();
int n=count;
            while(count-->0){
                TreeNode temp=q.poll();
                sum+=temp.val;
                
                if(temp.left!=null){
                   q.offer(temp.left); 
                }
                if(temp.right!=null){
                   q.offer(temp.right); 
                }
                
            }
            list.add(sum/n); 
        }
        return list;
    }
}


