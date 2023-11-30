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
    //Jai Shree Ram
    Map<Integer, Integer> map=new HashMap<>();
    int maxCount=0;
    
    public int[] findFrequentTreeSum(TreeNode root) {
        postTraversal(root);
        
        List<Integer> list=new ArrayList<>();
        for(int key : map.keySet()){
            if(maxCount==map.get(key)){
                list.add(key);
            }
        }
        
        //Stream to Array Convert
        return list.stream().mapToInt(x->x.intValue()).toArray();
        
        
    }
    
    public int postTraversal(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int leftSum=postTraversal(root.left);
        int rightSum=postTraversal(root.right);
        int sum=leftSum+rightSum+root.val;
        
        map.put(sum, map.getOrDefault(sum,0)+1);
        maxCount=Math.max(maxCount, map.get(sum));
        
        return sum;
    }
}