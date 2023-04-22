class StreamChecker {
    
    class TrieNode{
        TrieNode [] children=new TrieNode[26];
        boolean eow=false;
        
    }
    
    TrieNode root=new TrieNode();
    public StreamChecker(String[] words) {
        
        for(String s:words){
            TrieNode node=root;
            for(int i=s.length()-1;i>=0;i--){
                char ch=s.charAt(i);
                if(node.children[ch-'a']==null){
                    node.children[ch-'a']=new TrieNode();
                }
                node=node.children[ch-'a'];
            }
            node.eow=true;
        }
        
    }
    
    StringBuilder sb=new StringBuilder();
    public boolean query(char letter) {
        sb.append(letter);
        TrieNode node=root;
        for(int i=sb.length()-1;i>=0;i--){
            char ch=sb.charAt(i);
            if(node!=null){
                node=node.children[ch-'a'];
            }
            
            if(node==null){
                return false;
            }
            
            if(node!=null && node.eow==true){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */