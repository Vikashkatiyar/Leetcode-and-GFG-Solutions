/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        distanceKHelper(root, target.val, k, ans);
        return ans;
    }
    public static int distanceKHelper(TreeNode root, int target, int k, ArrayList<Integer> ans){
        if(root==null){
            return -1;
        }
        
        if(root.val==target){
            kDown(root,k-0, null, ans);
            return 1;
        }
        
        int leftDis=distanceKHelper(root.left,target, k, ans);
        if(leftDis!=-1){
            kDown(root, k-leftDis,root.left, ans);
            return leftDis+1;
        }
        int rightDis=distanceKHelper(root.right,target, k, ans);
        if(rightDis!=-1){
            kDown(root, k-rightDis,root.right, ans);
            return rightDis+1;
        }
        
        return -1;
        
    }
    
    public static void kDown(TreeNode root, int k, TreeNode blockNode, ArrayList<Integer> ans){
        if(root==null || k<0 || root==blockNode){
            return;
        }
        
        if(k==0){
            ans.add(root.val);
            return;
        }
        
        kDown(root.left, k-1, blockNode, ans);
        kDown(root.right, k-1, blockNode, ans);
    }
}