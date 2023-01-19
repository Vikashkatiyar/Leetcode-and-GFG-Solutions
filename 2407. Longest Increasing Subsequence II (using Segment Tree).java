class Solution {
    //Segment Tree Node
    class Node{
        int val;
        int start;
        int end;

        Node left;
        Node right;

    }
   //Segment Tree Construction
    Node construct(int ss,int se){
        if(ss==se){
            Node node=new Node();
            node.start=node.end=ss;
            node.val=0;
            return node;
        }
        int mid=(ss+se)/2;

        Node node=new Node();
        node.start=ss;
        node.end=se;

        node.left=construct(ss,mid);
        node.right=construct(mid+1,se);
        node.val=Math.max(node.left.val,node.right.val);

        return node;
    }
    
    //Segment Tree Update Value  idx==old value with idx
    void update(Node node,int idx,int val){
        if(node.start==node.end){
            node.val=val;
            return;
        }


        int mid=(node.start+node.end)/2;
        if(idx<=mid){
            update(node.left,idx,val);
        }else{
            update(node.right,idx,val);
        }

        node.val=Math.max(node.left.val,node.right.val);
    }

     //finding the val of range (qs to qe) -> using array this work is also done but high TC
    int query(Node node,int qs,int qe){
        if(node.start>qe || node.end<qs){ //first portion
            return 0;
        }
        else if(node.start>=qs && node.end<=qe){ //middle portion fully cover
            return node.val;
        }
        else{   //partial cover or any other portion
            int lval=query(node.left,qs,qe);
            int rval=query(node.right,qs,qe);
            return Math.max(lval,rval);
        }
    }
    

    //Question Function
    public int lengthOfLIS(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
        }
        Node root=construct(1,max);

        int res=0;
        for(int num:nums){
            int qs=num-k>=1?num-k:1;
            int qe=num-1;
            int len=query(root,qs,qe)+1;
            
            update(root,num,len);
            res=Math.max(res,len);
        }

        return res;
    }
}
