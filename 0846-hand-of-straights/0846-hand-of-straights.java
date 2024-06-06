class Solution {
    public boolean isNStraightHand(int[] hands, int groupSize) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int hand: hands){
            pq.add(hand);
        }
        
        while(!pq.isEmpty()){
            int ele=pq.peek();
            
            for(int i=0;i<groupSize;i++){
                if(pq.remove(ele+i)==false){
                    return false;
                }
            }
        }
        
        return true;
    }
}