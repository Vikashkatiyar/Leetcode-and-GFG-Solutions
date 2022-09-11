class Solution {
    public int minGroups(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]) ;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int [] interval:intervals){
            int start=interval[0];
            int end=interval[1];
            if(!pq.isEmpty() && start>pq.peek()){
                pq.poll();
            }
            pq.offer(end);
        }
        return pq.size();
    }
}