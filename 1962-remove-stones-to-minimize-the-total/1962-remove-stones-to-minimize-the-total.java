class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int x:piles){
            pq.offer(x);
        }
        
        while(k-->0){
            int x=pq.poll();
            int y=(int)Math.floor(x/2);
            x-=y;
            
            if(x>0){
                pq.offer(x);
            }
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}