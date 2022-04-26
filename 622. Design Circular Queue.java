class MyCircularQueue {
    private int []arr;
    private int front;
    private int rear;
    

    public MyCircularQueue(int k) {
        this.arr=new int [k];
        this.front =-1;
        this.rear=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        arr[rear]=value;
        if(front==-1){
            front=rear;
        }
        rear=(rear+1)%arr.length;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        int val=arr[front];
        front=(front+1)%arr.length;
        if(front==rear)
            front=-1;
        return true;
        
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[(rear-1+arr.length)%arr.length];
        
    }
    
    public boolean isEmpty() {
        if(front ==-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull() {
        
       return (front==rear);
            
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
