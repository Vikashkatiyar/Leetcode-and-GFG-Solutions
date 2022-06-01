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
    int count=0;
    public int countPairs(TreeNode root, int distance) {
        helper(root,distance);
        return count;
    }
    
    public List<Integer> helper(TreeNode root,int distance){
        if(root==null){
            return new ArrayList<Integer>();
        }
        
        if(root.left==null && root.right==null){
            ArrayList<Integer> sublist=new ArrayList<>();
            sublist.add(1);
            return sublist;
        }
        
        
       List<Integer> l1=helper(root.left,distance);
       List<Integer> l2=helper(root.right,distance);
        
        for(int n1:l1){
            for(int n2:l2){
                if(n1+n2<=distance){
                    count++;
                }
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        for(int val:l1)
            list.add(val+1);
        for(int val:l2)
            list.add(val+1);
        return list;

    }
}