class RecentCounter {
    
    Queue<Integer> q;
    public RecentCounter() {
        q=new LinkedList<>();
    }
    
    public int ping(int t) {
        if(q.size()==0){
            q.add(t);
            return 1;
        }else{
            int margin=t-3000;
            while(q.size()!=0 && q.peek()< margin){
                q.poll();
            }
            q.add(t);
            return q.size();
        }
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */