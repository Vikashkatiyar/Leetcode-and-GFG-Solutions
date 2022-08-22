class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        //use inside Collections.reverse();
        for(int val:map.values()){
            pq.offer(val);
        }
        
        int sum=0;
        int count=0;
        while(sum<arr.length/2){
            sum+=pq.poll();
            count++;
        }
        return count;
    }
}