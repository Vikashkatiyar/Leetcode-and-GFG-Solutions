class CustomStack {
     int values[];
    int increment[];
    int index;
    public CustomStack(int maxSize) {
        values=new int[maxSize];
        increment=new int[maxSize];
        index=-1;
    }
    
    public void push(int x) {
        if(index+1==values.length){
            return;
        }
        index++;
        values[index]=x;
        increment[index]=0;
    }
    
    public int pop() {
        if(index==-1){
            return -1;
        }
        
        int x=values[index];
        int inc=increment[index];
        index--;
        if(index>=0){
            increment[index]+=inc;
        }
        return x+inc;
    }
    
    public void increment(int k, int val) {
        int idx=Math.min(k-1,index);
        if(index>=0)
          increment[idx]+=val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */