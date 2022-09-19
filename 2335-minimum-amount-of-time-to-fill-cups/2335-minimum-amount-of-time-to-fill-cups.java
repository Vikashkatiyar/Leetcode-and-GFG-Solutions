class Solution {
    public int fillCups(int[] nums) {
         PriorityQueue<Integer> pq=new PriorityQueue<>((x,y)->y-x);
         for (int i: nums) {
            if (i != 0) 
                pq.offer(i);
        }
        int count=0;
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            count++;
            x--;
            y--;
            if(x>0){
                pq.offer(x);
            }
            if(y>0){
                pq.offer(y);
            }
        }
        return pq.isEmpty()?count:count+pq.poll();
    }
}