class Trie {
    class Node{
        boolean eow=false;
        Node []children=new Node[26];
    }
    Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node node=root;
        for(char ch:word.toCharArray()){
            if(node.children[ch-'a']==null){
                node.children[ch-'a']=new Node();
            }
            node=node.children[ch-'a'];
        }
        node.eow=true;
    }
    
    public boolean search(String word) {
        Node node =root;
        for(char ch:word.toCharArray()){
            if(node.children[ch-'a']==null){
                return false;
            }
            node=node.children[ch-'a'];
        }
        if(node.eow==true){
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        Node node=root;
        for(char ch:prefix.toCharArray()){
            if(node.children[ch-'a']==null){
                return false;
            }  
            node=node.children[ch-'a'];
            
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */