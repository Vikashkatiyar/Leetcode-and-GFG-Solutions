class NumArray {
    //using Segment Tree TC:O(logn)
    class Node{
        int start;
        int end;
        
        Node left;
        Node right;
        
        int val;
    }
    Node root;
    
    Node constructSegmentTree(int []nums,int lo,int hi){
        if(lo==hi){
            Node node=new Node();
            node.start=node.end=lo;
            node.left=node.right=null;
            node.val=nums[lo];
            return node;
        }
        Node node=new Node();
        node.start=lo;
        node.end=hi;
        
        int mid=lo+(hi-lo)/2;
        node.left=constructSegmentTree(nums,lo,mid);
        node.right=constructSegmentTree(nums,mid+1,hi);
        
        node.val=node.left.val+node.right.val;
        
        return node;
    }
     
    
    public NumArray(int[] nums) {
        root=constructSegmentTree(nums,0,nums.length-1);
    }
    
    void updateSegmentTree(Node node,int idx,int val){
        if(node.start==node.end){
            node.val=val;
            return;
        }
        int mid=(node.start+node.end)/2;
        if(idx<=mid){
            updateSegmentTree(node.left,idx,val);
        }else{
            updateSegmentTree(node.right,idx,val);
        }
        
        node.val=node.left.val+node.right.val;
    }
    
    public void update(int index, int val) {
        updateSegmentTree(root,index,val);
    }
     int query(Node node,int qs,int qe){
         if(qs>node.end || qe<node.start){
            return 0;
         }else if(node.start>=qs && node.end<= qe){
             return node.val;
         }else{
             int lval=query(node.left,qs,qe);
             int rval=query(node.right,qs,qe);
             return lval+rval;
         }
     }
    public int sumRange(int left, int right) {
        return query(root,left,right);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */