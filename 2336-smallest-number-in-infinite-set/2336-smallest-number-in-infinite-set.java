class SmallestInfiniteSet {
     int []count=new int[1001];
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    
    public SmallestInfiniteSet() {
      for(int i=1;i<count.length;i++){
          pq.add(i);
          count[i]++;
      }    
    }
    
    public int popSmallest() {
        int small=pq.poll();
        count[small]--;
        return small;
    }
    
    public void addBack(int num) {
        if(count[num]==0){
            pq.add(num);
            count[num]++;
        }
        
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */