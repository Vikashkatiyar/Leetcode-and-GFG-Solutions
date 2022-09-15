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
    //TC:O(n);
    // sc:O(n)
    int ans=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] freq=new int[10];
        helper(root,freq);
        return ans;
    }
    public void helper(TreeNode root,int[] freq){
        if(root==null){
            return;
        }
        
        freq[root.val]++;
        if(root.left==null && root.right==null){
           if(isPalindromicPermutetion(freq)){
               ans++;
           }
        }
        helper(root.left,freq);
        helper(root.right,freq);
        
        freq[root.val]--;
        
        
    }
    
    public boolean isPalindromicPermutetion(int [] freq){
        boolean oddfrFound=false;
        for(int ele:freq){
            if(ele%2!=0){
                if(oddfrFound){
                    return false;
                }else{
                    oddfrFound=true;
                }
            }
        }
        return true;
    }
}