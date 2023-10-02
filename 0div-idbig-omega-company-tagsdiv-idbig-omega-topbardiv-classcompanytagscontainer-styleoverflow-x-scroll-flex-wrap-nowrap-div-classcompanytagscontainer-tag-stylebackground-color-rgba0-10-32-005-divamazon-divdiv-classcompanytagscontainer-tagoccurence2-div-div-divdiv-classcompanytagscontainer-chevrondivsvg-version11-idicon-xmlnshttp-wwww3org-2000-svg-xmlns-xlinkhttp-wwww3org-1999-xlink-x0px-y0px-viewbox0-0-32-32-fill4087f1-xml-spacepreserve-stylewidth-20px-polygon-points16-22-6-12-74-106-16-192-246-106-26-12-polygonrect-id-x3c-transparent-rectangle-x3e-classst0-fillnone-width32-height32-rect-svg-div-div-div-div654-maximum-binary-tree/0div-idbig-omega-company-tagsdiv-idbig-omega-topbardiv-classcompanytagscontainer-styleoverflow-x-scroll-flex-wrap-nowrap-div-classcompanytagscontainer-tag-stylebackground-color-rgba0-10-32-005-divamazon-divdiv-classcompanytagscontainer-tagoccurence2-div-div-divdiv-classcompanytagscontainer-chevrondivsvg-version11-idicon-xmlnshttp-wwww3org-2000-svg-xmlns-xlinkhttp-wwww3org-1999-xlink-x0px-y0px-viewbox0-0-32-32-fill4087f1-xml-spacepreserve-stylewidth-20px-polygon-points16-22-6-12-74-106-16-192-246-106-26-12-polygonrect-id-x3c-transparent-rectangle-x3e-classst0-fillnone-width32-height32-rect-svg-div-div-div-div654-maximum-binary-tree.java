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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n=nums.length;
        return constructMaximumBinaryTree(nums,0,n-1);
    }
    
    public TreeNode constructMaximumBinaryTree(int[]nums,int start,int end){
        if(start>end){
            return null;
        }
        int maxVal=Integer.MIN_VALUE;
        int idx=0;
        for(int i=start;i<=end;i++){
            if(nums[i]>maxVal){
                maxVal=nums[i];
                idx=i;
            }
        }
        TreeNode root=new TreeNode(nums[idx]);
        
        root.left=constructMaximumBinaryTree(nums,start,idx-1);
        root.right=constructMaximumBinaryTree(nums,idx+1,end);
        
        return root;
        
    }
}