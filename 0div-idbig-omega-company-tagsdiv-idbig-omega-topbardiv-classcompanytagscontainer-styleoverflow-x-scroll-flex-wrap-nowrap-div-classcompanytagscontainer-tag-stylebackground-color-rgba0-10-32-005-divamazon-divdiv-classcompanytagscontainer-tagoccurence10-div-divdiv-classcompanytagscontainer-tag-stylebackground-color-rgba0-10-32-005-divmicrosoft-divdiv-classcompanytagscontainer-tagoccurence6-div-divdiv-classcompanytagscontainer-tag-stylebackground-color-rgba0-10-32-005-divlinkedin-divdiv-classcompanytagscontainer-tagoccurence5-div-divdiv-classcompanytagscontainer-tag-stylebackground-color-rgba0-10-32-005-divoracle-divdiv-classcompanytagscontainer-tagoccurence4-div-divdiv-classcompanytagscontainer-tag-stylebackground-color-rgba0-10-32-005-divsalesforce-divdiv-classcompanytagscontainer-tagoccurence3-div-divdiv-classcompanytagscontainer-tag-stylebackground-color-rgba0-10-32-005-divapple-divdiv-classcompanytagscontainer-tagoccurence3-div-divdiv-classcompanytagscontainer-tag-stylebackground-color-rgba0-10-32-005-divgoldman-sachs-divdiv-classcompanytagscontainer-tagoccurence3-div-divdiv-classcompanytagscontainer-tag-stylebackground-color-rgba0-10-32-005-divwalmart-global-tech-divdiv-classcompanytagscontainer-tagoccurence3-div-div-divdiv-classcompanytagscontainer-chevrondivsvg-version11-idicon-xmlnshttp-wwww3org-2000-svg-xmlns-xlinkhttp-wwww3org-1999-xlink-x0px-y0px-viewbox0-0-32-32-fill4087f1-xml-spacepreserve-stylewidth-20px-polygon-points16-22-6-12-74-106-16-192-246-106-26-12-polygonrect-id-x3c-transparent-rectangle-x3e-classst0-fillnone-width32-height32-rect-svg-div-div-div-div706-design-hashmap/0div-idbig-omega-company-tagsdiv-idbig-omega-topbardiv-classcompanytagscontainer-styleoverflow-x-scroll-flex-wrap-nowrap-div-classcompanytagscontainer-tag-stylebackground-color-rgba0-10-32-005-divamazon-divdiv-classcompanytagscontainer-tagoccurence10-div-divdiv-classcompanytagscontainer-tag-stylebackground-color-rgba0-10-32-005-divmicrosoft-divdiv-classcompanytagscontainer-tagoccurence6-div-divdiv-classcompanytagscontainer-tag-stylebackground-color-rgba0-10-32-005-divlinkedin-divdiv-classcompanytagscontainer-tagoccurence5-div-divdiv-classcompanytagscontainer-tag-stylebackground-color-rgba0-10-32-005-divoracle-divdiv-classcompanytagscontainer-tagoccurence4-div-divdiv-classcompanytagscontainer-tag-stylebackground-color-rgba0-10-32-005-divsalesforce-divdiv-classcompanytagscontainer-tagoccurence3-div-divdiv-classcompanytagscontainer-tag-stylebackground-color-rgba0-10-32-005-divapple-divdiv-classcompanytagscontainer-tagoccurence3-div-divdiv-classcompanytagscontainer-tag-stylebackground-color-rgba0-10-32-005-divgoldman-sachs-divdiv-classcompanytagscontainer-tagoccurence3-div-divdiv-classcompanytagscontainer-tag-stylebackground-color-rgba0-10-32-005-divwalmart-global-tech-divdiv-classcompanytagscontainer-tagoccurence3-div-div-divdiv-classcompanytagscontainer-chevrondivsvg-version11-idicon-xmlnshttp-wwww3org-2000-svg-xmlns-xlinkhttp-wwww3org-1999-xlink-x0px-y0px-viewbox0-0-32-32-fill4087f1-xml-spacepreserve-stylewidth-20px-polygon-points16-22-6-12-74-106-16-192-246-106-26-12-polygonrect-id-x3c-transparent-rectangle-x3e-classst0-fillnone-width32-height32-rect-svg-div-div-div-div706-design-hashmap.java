class MyHashMap {
    
    class HMNode{
        int key;
        int value;
        HMNode(int key, int value){
            this.key=key;
            this.value=value;
        }
    }
    
    LinkedList<HMNode> [] buckets;
    final int SIZE=1009;
    
    
    public MyHashMap() {
        buckets=new LinkedList[SIZE];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<HMNode>();
        }
    }
    
    public void put(int key, int value) {
        int index=getHash(key);
        LinkedList<HMNode> allPairs=buckets[index];
        if(get(key)!=-1){
            remove(key);
        }
        HMNode node=new HMNode(key, value);
        allPairs.add(node);
    }
    
    public int get(int key) {
        int index=getHash(key);
        LinkedList<HMNode> allPairs=buckets[index];
        Iterator<HMNode> it=allPairs.iterator();
        while(it.hasNext()){
            HMNode node=it.next();
            if(node.key==key){
                return node.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int index=getHash(key);
        LinkedList<HMNode> allPairs=buckets[index];
        Iterator<HMNode> it=allPairs.iterator();
        while(it.hasNext()){
            HMNode node=it.next();
            if(node.key==key){
                 it.remove();
            }
        }
    }
    
    private int getHash(int key){
        return key%SIZE;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */