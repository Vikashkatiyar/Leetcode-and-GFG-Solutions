class MinStack {
    Stack<Integer> st1,st2;
    
    public MinStack() {
        st1=new Stack<Integer>();
        st2=new Stack<Integer>();
        
    }
    
    public void push(int val) {
        if(st1.size()==0 || val<=st2.peek())
        {
            st1.push(val);
            st2.push(val);
        }
        else{
            st1.push(val);
        }
    }
    
    public void pop() {
        if((st1.peek()).equals(st2.peek())){
           
            st2.pop();
        }
        st1.pop();
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int getMin() {
        return st2.peek();
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