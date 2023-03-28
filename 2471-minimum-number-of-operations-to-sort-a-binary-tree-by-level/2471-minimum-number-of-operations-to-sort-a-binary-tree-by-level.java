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
    public int minimumOperations(TreeNode root) {
        LinkedList<TreeNode> q=new LinkedList<>();
        q.addLast(root);
        int res=0;
        while(q.size()>0){
            int[] arr=new int[q.size()];
            int size=q.size();
            int i=0;
            while(size-->0){
                TreeNode rem=q.removeFirst();
                arr[i++]=rem.val;
                
                if(rem.left!=null){
                    q.add(rem.left);
                }
                
                if(rem.right!=null){
                    q.add(rem.right);
                }
            }
            res+=minSwaps(arr);
            
        }
        return res;
    }
    
    public int minSwaps(int [] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
            map.put(arr[i],i);
        }
        
        Arrays.sort(temp);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=temp[i]){
                ans++;
                int init=arr[i];
                swap(arr,i,map.get(temp[i]));
                
                //update on  map
                map.put(init,map.get(temp[i]));
                map.put(temp[i],i);
            }
        }
        return ans;
    }
    
    public void swap(int[]arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}