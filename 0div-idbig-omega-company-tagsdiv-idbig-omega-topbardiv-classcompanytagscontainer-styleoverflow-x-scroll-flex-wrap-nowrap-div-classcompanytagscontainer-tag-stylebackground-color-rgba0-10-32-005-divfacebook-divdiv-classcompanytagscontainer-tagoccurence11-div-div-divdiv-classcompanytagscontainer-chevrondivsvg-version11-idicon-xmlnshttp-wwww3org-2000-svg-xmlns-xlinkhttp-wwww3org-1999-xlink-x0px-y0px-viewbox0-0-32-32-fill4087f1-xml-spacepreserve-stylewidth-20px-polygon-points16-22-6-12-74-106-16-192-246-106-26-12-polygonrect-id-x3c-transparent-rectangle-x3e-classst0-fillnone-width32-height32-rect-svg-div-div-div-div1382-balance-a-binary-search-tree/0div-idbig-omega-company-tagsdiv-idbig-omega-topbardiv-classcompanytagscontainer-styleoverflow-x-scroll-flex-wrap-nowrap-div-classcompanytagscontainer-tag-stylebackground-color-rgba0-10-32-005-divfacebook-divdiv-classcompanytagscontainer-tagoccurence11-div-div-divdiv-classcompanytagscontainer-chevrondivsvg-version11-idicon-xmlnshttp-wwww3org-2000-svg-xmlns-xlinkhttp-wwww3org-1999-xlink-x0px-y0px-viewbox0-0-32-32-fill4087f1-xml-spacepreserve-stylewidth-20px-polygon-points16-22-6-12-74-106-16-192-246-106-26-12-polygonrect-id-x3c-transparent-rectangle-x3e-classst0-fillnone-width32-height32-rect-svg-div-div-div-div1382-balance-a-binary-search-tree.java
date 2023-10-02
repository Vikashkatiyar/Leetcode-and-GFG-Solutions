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
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> sortedArray=new ArrayList<>();
        //step1.get the sorted Array from inorder Traversal
        inorderTraversal(root,sortedArray);
        
        //step2. build bst from sortedArray
        return buildBstFromInorder(sortedArray,0,sortedArray.size()-1);
    }
    
    public void inorderTraversal(TreeNode root,List<TreeNode> sortedArray ){
        if(root==null){
            return;
        }
        inorderTraversal(root.left,sortedArray);
        sortedArray.add(root);
        inorderTraversal(root.right,sortedArray);
    }
    
    public TreeNode buildBstFromInorder(List<TreeNode> sortedArray, int start, int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode root=sortedArray.get(mid);
        
        root.left=buildBstFromInorder(sortedArray,start, mid-1);
        root.right=buildBstFromInorder(sortedArray,mid+1,end);
        
        return root;
    }
    
    
}