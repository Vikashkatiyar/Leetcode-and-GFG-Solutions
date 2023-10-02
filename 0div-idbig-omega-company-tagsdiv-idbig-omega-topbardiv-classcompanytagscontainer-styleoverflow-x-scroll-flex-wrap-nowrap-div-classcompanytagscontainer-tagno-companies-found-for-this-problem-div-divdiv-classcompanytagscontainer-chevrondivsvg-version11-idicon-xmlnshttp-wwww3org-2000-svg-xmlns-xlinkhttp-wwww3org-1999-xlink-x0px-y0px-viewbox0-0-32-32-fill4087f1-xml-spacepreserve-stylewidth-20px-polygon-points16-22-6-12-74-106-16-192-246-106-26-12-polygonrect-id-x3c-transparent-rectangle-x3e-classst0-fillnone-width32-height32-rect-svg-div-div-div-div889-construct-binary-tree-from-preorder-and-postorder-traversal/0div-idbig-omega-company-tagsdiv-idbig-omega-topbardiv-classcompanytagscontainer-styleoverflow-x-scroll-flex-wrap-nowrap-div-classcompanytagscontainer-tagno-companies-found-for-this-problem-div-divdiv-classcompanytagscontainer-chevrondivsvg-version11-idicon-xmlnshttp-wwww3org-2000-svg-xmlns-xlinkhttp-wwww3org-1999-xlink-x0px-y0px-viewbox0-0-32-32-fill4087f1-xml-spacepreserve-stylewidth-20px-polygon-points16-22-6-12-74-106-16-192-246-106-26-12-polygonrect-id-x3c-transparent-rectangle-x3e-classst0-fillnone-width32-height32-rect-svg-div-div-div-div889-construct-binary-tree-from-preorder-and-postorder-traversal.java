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
    
    
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        int n=pre.length;
        return constructFromPrePost(pre,0,n-1,post,0,n-1);
    }
    
    
    public TreeNode constructFromPrePost(int[] pre,int prestart,int prend, int[] post,int pos,int poe) {
        if(prestart>prend){
            return null;
        }
        
        TreeNode root=new TreeNode(pre[prestart]);
        if(prestart==prend){ //only one size array
            return root;
        }
        
        //find the nextelement of preorder in postorder array
        int idx=pos;
        while(pre[prestart+1]!=post[idx]){
            idx++;
        }
        int totalLen=idx-pos+1;//length of array in postorder 
        
        root.left=constructFromPrePost(pre,prestart+1,prestart+totalLen,post,pos,idx);
        root.right=constructFromPrePost(pre,prestart+totalLen+1,prend,post,idx+1,poe-1);
        
        return root;
    }
    
}