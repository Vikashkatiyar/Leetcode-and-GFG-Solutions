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
        return helper(root);
    }
    
    int helper(TreeNode node){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(node);
        int count=0;
        while(q.size()!=0){
            int size=q.size();
            int []arr=new int[size];
            for(int i=0;i<size;i++){
                TreeNode currNode=q.poll();
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
                arr[i]=currNode.val;
            }
            count+=minSwaps(arr);
        }
        return count;
    }
    
    public int minSwaps(int nums[])
    {
        // Code here
        int n=nums.length;
        int []temp=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[i];
            map.put(nums[i],i);
        }
        Arrays.sort(temp);
        
        //convert nums array -> temp array
        int count=0;
        for(int i=0;i<n;i++){
              if(temp[i]!=nums[i]){
                  count++;
                  int idx=map.get(temp[i]);
                  swap(nums,i,idx);
                  map.put(nums[i],i);
                  map.put(nums[idx],idx);
              }
        }
        return count;
    }
    
   public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}