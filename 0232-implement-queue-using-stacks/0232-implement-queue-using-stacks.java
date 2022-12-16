class MyQueue {

//     public MyQueue() {
        
//     }
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    
    
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if(s1.size()==0){
            return -1;
        }
        else{
            while(s1.size()>1){
                s2.push(s1.pop());
            }
            int val=s1.pop();
            while(s2.size()>0){
                s1.push(s2.pop());
            }
             return val;
        }
       
    }
    
    public int peek() {
        if(s1.size()==0){
            return -1;
        }
        else{
            while(s1.size()>1){
                s2.push(s1.pop());
            }
            int val=s1.pop();
            s2.push(val);
            while(s2.size()>0){
                s1.push(s2.pop());
            }
            return val;
        }
        
    }
    
    public boolean empty() {
        if(s1.isEmpty())
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */