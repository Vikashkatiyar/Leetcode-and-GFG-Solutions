class Solution {
    class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private long score=0L;
        private int nodeCount=0;
    }
    
    private int countNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        root.nodeCount=countNodes(root.left)+ countNodes(root.right)+1;
        return root.nodeCount;
    }
    
    public int countHighestScoreNodes(int[] parents) {
        long max=0L;
        
        int n=parents.length;
        int ans=0;
        TreeNode[] tree=new TreeNode[n];
        //build tree
        buildTree(parents, tree);
        
        //fill the nodeCount value of every node
        countNodes(tree[0]);
        
        //fill the score value of every node
        for(int i=0;i<parents.length;i++){
            long product=1;
            int leftCount=tree[i].left==null ?0 :tree[i].left.nodeCount;
            int rightCount=tree[i].right==null ? 0 :tree[i].right.nodeCount;
            int parentCount=n-1-leftCount-rightCount;
            
            if(leftCount>0){
                product*=leftCount;
            }
            if(rightCount>0){
                product*=rightCount;
            }
            if(parentCount>0){
                product*=parentCount;
            }
            
            tree[i].score=product;
            max=Math.max(max, product);
        }
        
        //countNodes
         for(int i=0;i<parents.length; i++){
             if(tree[i].score==max){
                 ans++;
             }
         }
        return ans;
    }
    private void buildTree(int[] parents, TreeNode[] tree){
        for(int i=0;i<parents.length;i++){
            tree[i]=new TreeNode();
        }
        
        for(int i=1;i<parents.length;i++){
            int parentId=parents[i];
            if(tree[parentId].left==null){
                tree[parentId].left=tree[i];
            }else{
                tree[parentId].right=tree[i];
            }
        }
    }
}