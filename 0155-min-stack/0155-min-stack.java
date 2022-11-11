class MinStack {
    Stack<Long> st;
    Long min;

    public MinStack() {
        st=new Stack<Long>();
        min=Long.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push((long)val);
            min=(long)val;
        }else if(val>=min){
            st.push((long)val);
        }else{
            st.push((long)val+val-min);
            min=(long)val;
        }
    }
    
    public void pop() {
        if(st.peek()>=min){
            st.pop();
        }else{
            min= 2*min-st.peek(); 
            st.pop();
        }
    }
    
    public int top() {
        if(st.peek()>=min){
            return st.peek().intValue();
        }else{
            return min.intValue();  
        }
    }
    
    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */