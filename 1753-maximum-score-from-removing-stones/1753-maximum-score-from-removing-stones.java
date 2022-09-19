class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((x,y)->y-x);
        pq.offer(a);
        pq.offer(b);
        pq.offer(c);
        int count=0;
        while(pq.size()>=2){
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
        return count;
                
    }
}