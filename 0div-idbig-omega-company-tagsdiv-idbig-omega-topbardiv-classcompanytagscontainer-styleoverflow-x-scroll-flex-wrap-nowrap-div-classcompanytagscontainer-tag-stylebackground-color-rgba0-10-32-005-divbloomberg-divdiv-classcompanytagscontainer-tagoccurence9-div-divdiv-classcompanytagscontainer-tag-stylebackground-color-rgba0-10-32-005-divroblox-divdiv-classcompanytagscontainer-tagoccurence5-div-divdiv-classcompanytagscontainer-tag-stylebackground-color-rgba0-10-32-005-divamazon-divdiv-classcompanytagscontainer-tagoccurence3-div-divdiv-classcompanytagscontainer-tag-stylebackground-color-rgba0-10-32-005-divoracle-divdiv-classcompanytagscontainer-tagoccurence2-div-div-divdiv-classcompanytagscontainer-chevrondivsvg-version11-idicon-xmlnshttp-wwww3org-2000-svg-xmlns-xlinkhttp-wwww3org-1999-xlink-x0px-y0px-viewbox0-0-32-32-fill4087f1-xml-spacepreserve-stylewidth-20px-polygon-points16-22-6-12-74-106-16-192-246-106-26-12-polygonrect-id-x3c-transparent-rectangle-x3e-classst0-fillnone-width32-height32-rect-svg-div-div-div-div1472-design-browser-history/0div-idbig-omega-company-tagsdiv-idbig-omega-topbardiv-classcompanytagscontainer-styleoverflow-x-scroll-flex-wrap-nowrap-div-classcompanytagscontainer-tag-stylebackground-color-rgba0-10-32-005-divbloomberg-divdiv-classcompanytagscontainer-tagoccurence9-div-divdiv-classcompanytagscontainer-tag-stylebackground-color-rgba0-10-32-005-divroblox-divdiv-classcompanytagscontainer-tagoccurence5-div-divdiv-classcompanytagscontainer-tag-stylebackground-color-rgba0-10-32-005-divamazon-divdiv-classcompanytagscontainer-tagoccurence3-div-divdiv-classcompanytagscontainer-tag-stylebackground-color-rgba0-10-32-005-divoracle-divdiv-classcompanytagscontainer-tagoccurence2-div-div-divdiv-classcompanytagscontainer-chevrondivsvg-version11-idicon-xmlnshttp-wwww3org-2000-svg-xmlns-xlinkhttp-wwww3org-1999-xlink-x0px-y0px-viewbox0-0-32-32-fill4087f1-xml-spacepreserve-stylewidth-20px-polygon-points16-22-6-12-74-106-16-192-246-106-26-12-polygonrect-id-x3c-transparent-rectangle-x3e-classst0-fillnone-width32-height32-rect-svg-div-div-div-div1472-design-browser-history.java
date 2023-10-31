class BrowserHistory {
    
    class Node{
        //Double LinkedList
        Node prev,next;
        String url;
        
        Node(String url){
            prev=null;
            next=null;
            this.url=url;
        }
    }
    
    Node curr;
    public BrowserHistory(String homepage) {
        curr=new Node(homepage);
    }
    
    public void visit(String url) {
        Node tempNode=new Node(url);
        curr.next=tempNode;
        tempNode.prev=curr;
        curr=curr.next;
    }
    
    public String back(int steps) {
        while(curr.prev!=null && steps-->0){
            curr=curr.prev;
        }
        
        return curr.url;
    }
    
    public String forward(int steps) {
        while(curr.next!=null && steps-->0){
            curr=curr.next;
        }
        
        return curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */