class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq=new PriorityQueue<>((a, b) -> Double.compare(b, a));
        double sum=0;
        for(int a:nums){
            pq.offer(Double.valueOf(a));
            sum+=a;
        }
        double half=sum/2;
        int count=0;
        
        while(sum>half){
            double val=pq.poll();
            val/=2;
            sum-=val;
            pq.offer(val);
            
            count++;
        }
        return count;
    }
}