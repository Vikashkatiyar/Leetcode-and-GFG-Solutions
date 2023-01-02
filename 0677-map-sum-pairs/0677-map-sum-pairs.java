class MapSum {
    class Node{
        int value=0;
        Node []children=new Node[26];
    }
     Node root;
    public MapSum() {
        root=new Node();
    }
    
    public void insert(String key, int val) {
        Node node=root;
        for(char ch:key.toCharArray()){
            if(node.children[ch-'a']==null){
                node.children[ch-'a']=new Node();
            }
            node=node.children[ch-'a'];
        }
        node.value=val; //last node fill with val
    }
    int sum;
    public int sum(String prefix) {
        Node node=root;
        for(char ch:prefix.toCharArray()){
            if(node.children[ch-'a']==null){
                return 0;
            }
            node=node.children[ch-'a'];
        }
        sum=0;
        helperSum(node);
                /*["MapSum", "insert", "sum", "insert", "sum"]
                 [[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]*/
                //ap ke aage ke nodes se value sum karke de denge
        return sum;
    }
    
    public void helperSum(Node node){
        sum+=node.value;
        for(Node child:node.children){
            if(child!=null){
                helperSum(child);
            }
        }
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */