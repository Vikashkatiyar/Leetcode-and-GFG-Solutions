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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele: to_delete){
            set.add(ele);
        }
        ArrayList<TreeNode> ans=new ArrayList<>();
        helperDFS(root,set,ans);
        if(!set.contains(root.val)){
            ans.add(root);
        }
        
        return ans;
    }
    
    private TreeNode helperDFS(TreeNode root, HashSet<Integer> set, ArrayList<TreeNode> ans){
        if(root==null){
            return null;
        }
        root.left=helperDFS(root.left,set,ans);
        root.right=helperDFS(root.right,set, ans);
        if(set.contains(root.val)){
            if(root.left!=null){
                ans.add(root.left);
            }
            
            if(root.right!=null){
                ans.add(root.right);
            }
            return null;
        }
        
        
        return root;
    }
}