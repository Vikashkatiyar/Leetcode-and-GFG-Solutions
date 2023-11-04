class FrontMiddleBackQueue {
    
    LinkedList<Integer> list;
    public FrontMiddleBackQueue() {
        list=new LinkedList<>();
    }
    
    public void pushFront(int val) {
        list.add(0,val);
        
    }
    
    public void pushMiddle(int val) {
        list.add(list.size()/2,val);
    }
    
    public void pushBack(int val) {
        list.add(val);
    }
    
    public int popFront() {
        if(list.size()==0){
            return -1;
        }
        return list.removeFirst();
    }
    
    public int popMiddle() {
        if(list.size()==0){
            return -1;
        }
        return list.remove(findMid());
    }
    
    public int findMid(){
        return (list.size()-1)/2;
    }
    
    public int popBack() {
        if(list.size()==0){
            return -1;
        }
        return list.removeLast();
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */