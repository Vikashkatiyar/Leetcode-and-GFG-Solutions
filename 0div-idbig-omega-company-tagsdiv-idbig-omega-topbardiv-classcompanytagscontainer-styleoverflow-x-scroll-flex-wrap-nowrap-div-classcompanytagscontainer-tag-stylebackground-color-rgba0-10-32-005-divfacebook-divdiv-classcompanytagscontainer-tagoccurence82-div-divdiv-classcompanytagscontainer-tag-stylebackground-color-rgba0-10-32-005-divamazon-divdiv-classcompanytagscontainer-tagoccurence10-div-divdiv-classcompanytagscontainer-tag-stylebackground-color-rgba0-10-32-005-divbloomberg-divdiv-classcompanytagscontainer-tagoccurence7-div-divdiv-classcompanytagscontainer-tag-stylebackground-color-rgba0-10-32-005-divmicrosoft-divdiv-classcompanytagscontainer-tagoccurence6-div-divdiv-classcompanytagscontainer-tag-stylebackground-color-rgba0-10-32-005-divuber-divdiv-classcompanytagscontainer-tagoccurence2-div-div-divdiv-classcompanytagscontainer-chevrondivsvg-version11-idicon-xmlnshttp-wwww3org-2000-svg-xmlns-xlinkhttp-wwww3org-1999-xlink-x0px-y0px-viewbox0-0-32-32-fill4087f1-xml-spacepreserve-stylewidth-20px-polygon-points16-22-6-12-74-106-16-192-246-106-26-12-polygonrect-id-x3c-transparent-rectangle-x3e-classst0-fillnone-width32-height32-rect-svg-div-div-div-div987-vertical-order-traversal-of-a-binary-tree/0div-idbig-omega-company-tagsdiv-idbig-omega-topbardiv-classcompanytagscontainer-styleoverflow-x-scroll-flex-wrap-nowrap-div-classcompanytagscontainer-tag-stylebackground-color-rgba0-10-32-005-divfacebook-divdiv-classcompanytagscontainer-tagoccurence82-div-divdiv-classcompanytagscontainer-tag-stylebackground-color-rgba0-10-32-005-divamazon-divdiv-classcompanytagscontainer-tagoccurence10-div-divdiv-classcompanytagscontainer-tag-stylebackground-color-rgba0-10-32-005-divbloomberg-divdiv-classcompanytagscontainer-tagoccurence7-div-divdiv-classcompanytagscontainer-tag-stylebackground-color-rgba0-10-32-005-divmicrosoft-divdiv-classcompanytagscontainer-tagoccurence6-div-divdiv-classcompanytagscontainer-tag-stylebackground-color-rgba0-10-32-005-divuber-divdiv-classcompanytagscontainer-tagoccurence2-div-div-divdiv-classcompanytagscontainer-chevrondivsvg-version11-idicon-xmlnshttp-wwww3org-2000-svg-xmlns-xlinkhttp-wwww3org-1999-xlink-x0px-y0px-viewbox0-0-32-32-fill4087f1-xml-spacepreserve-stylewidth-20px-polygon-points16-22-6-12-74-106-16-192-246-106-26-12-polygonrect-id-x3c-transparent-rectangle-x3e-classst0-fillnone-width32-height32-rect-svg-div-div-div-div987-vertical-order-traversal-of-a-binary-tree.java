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
    class Tupal{
        TreeNode node;
        int vertical;
        int level;
        
        Tupal(TreeNode node, int vertical,int level){
            this.node=node;
            this.vertical=vertical;
            this.level=level;
        }
        
        
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer ,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        
        Queue<Tupal> q=new LinkedList<>();
        q.add(new Tupal(root,0,0));
        
        while(!q.isEmpty()){
            Tupal rem=q.poll();
            
            TreeNode node=rem.node;
            int vertical=rem.vertical;
            int level=rem.level;
            
            //add node in queue with vertical and level
            if(!map.containsKey(vertical)){
                map.put(vertical,new TreeMap<>());
            }
            
            if(!map.get(vertical).containsKey(level)){
                map.get(vertical).put(level,new PriorityQueue<>());
            }
            map.get(vertical).get(level).add(node.val);
            
            
            //add new Node in q 
            if(node.left!=null){
                q.add(new Tupal(node.left, vertical-1, level+1));
            }
            
            if(node.right!=null){
                q.add(new Tupal(node.right, vertical+1, level+1));
            }
        }
        
        
        //make answer
        List<List<Integer>> ans=new ArrayList<>();
        
        for(TreeMap<Integer,PriorityQueue<Integer>> tm:map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq: tm.values()){
                while(!pq.isEmpty()){
                    ans.get(ans.size()-1).add(pq.poll());
                }
            }
        }
        
        return ans;
    }
}