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
class FindElements {
    TreeNode root;
    public FindElements(TreeNode root) {
        this.root=root;
        root.val=0;
        buildTreeDFS(root);
    }
    
    public boolean find(int target) {
        return findByTarget(root,target);
    }
    
    private void buildTreeDFS(TreeNode root){
        if(root==null){
            return;
        }
        
        int x=root.val;
        if(root.left!=null){
            root.left.val=2*x+1;
        }
        if(root.right!=null){
            root.right.val=2*x+2;
        }
        
        buildTreeDFS(root.left);
        buildTreeDFS(root.right);
    }
    
    private boolean findByTarget(TreeNode  root, int target){
        if(root==null){
            return false;
        }
        
        if(root.val==target){
            return true;
        }
        
        return findByTarget(root.left,target) || findByTarget(root.right,target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */