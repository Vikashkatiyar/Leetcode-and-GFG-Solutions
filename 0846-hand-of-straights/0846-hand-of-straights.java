class Solution {
    public boolean isNStraightHand(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums){
            pq.offer(num);
        }
        
        while(!pq.isEmpty()){
            int ele=pq.peek();
            for(int i=0;i<k;i++){
                if(pq.remove(ele+i)==false){
                    //The remove method returns true if an object passed as a parameter is removed from the list. Otherwise, it returns false
                    return false;
                }
            }
        }
        return true;
    }
}