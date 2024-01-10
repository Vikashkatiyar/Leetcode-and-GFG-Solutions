class DataStream {
    Queue<Integer> q;
    private int value;
    private int k;
    public DataStream(int value, int k) {
        q=new LinkedList<>();
        this.value=value;
        this.k=k;
    }
    
    public boolean consec(int num) {
        if(num!=value){
            q.clear();
            return false;
        }else{
            q.add(num);
        }
        
        if(q.size()>=k){
            return true;
        }
        return false;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */