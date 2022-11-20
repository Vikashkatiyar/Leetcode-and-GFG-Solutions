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
    ArrayList<Integer> sortList=new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        sortList.add(root.val);
        inorder(root.right);
    }
    
    public int getMin(int target){
        int ans=-1;
        int lo=0;
        int hi=sortList.size()-1;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(sortList.get(mid)==target){
                return sortList.get(mid);
            }else if(sortList.get(mid)>target){
                hi=mid-1;
            }else{
              ans=sortList.get(mid);
                lo=mid+1;
            }
        }
        return ans;
    }
    
    
    public int getMax(int target){
        int ans=-1;
        int lo=0;
        int hi=sortList.size()-1;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(sortList.get(mid)==target){
                return sortList.get(mid);
            }else if(sortList.get(mid)<target){
                lo=mid+1;
            }else{
              ans=sortList.get(mid);
                hi=mid-1;
            }
        }
        return ans;
    }
    
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        inorder(root);
        List<List<Integer>> list=new ArrayList<>();
        for(int target:queries){
            int min=getMin(target);
            int max=getMax(target);
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(min);
            temp.add(max);
            list.add(temp);
        }
        return list;
    }
}