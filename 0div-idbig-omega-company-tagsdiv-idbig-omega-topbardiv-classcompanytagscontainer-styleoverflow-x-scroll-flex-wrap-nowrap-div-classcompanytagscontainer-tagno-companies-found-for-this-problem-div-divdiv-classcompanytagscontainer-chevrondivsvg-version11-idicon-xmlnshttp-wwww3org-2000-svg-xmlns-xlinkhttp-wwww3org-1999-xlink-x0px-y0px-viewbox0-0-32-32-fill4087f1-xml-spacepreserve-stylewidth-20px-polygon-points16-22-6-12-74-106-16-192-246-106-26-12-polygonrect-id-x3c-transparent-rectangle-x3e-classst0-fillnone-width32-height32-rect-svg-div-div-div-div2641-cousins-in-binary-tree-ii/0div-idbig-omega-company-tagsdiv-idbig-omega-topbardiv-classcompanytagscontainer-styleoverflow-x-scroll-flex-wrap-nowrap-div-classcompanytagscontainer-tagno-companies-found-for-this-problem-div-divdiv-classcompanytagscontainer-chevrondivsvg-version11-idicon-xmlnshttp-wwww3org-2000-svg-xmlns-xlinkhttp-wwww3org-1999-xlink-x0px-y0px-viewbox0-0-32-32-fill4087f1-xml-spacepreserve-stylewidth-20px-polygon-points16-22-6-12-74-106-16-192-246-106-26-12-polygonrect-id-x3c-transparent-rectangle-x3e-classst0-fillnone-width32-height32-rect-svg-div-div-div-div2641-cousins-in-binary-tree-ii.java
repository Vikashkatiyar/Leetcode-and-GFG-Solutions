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
    //Using BFS
    public TreeNode replaceValueInTree(TreeNode root) {
        root.val=0;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            List<TreeNode> sameLevelNodes=new ArrayList<>();
            int nextLevelSum=0;
            
            int size=q.size();
            while(size-->0){
                TreeNode rem=q.poll();
                sameLevelNodes.add(rem);
                
                if(rem.left!=null){
                    q.add(rem.left);
                    nextLevelSum+=rem.left.val;
                }
                
                if(rem.right!=null){
                    q.add(rem.right);
                    nextLevelSum+=rem.right.val;
                }
            }
            
            for(TreeNode node: sameLevelNodes){
                int sum=nextLevelSum;
                
                
                if(node.left!=null){
                    sum-=node.left.val;
                }
                if(node.right!=null){
                    sum-=node.right.val;
                }
                
                if(node.left!=null){
                    node.left.val=sum;
                }
                
                if(node.right!=null){
                    node.right.val=sum;
                }
                
            }
        }
        return root;
    }
}