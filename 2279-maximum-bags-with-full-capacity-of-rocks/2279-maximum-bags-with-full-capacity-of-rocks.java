class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<rocks.length;i++){
            pq.offer(capacity[i]-rocks[i]);
        }
        
        int count=0;
        while(!pq.isEmpty() && additionalRocks>=pq.peek()){
            additionalRocks-=pq.poll();
            count++;
        }
        return count;
    }
}