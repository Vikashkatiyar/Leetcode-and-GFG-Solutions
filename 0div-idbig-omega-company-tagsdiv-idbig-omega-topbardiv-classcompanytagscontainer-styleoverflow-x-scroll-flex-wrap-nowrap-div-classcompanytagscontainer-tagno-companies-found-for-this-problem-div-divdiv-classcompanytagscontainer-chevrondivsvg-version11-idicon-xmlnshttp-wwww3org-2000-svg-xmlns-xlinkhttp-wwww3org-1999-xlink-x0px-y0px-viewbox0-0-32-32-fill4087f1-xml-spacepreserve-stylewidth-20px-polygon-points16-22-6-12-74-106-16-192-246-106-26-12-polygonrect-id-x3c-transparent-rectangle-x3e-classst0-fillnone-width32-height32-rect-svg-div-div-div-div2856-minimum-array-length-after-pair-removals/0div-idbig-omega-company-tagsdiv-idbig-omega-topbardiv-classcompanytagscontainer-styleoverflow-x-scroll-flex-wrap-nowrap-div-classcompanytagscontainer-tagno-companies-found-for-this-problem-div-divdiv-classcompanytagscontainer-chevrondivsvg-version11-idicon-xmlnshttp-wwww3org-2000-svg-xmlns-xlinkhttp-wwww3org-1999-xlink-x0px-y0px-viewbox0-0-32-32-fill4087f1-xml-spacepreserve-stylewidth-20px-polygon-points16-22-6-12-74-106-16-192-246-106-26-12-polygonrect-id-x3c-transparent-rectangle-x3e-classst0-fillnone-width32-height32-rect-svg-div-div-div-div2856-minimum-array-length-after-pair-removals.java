class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
       Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.addAll(map.values());
        
        while(pq.size()>1){
            int fM=pq.remove();
            int sM=pq.remove();
            
            fM--;
            sM--;
            if(fM!=0){
                pq.add(fM);
                
            }
            
            if(sM!=0){
                pq.add(sM);
            }
        }
        
        int sum=0;
        while(pq.size()>0){
            sum+=pq.remove();
        }
        
        return sum;
    }
}