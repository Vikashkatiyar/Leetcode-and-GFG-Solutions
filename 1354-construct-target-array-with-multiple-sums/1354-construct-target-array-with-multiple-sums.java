class Solution {
    public boolean isPossible(int[] target) {
        long sum=0;
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int ele:target){
            sum+=ele;
            pq.offer(ele);
        }
        
        while(pq.peek()!=1){
            int value=pq.poll();
            long diff=sum-value;
            if(diff==1)
                return true;
            
            if(diff>value || diff==0 || value%diff==0)
                return false;
            
            value%=diff;
            sum=diff+value;
            pq.offer(value);
        }
        return true;
    }
}