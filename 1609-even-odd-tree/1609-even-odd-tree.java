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
    public boolean isEvenOddTree(TreeNode root) {
         int level=1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            int prev = 0;
            
            if(level%2==0) 
                prev=Integer.MAX_VALUE;
            
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(level%2==0){ //level is even values is odd in increasing order
                    if(curr.val%2==1 || prev<=curr.val){
                        return false;
                    }else{
                        prev = curr.val;
                    }
                }
                if(level%2==1){  //level is odd values is even in decresing order
                    if(curr.val%2==0 || prev>=curr.val){
                        return false;
                    }else{
                        prev = curr.val;
                    }
                }
                
                
                if(curr.left!=null) 
                    q.add(curr.left);
                if(curr.right!=null) 
                    q.add(curr.right);
            }
            ++level;
        }
        return true;
    }
}