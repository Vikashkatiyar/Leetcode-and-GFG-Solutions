class MagicDictionary {
    //Jai bhole
    class TrieNode{
        TrieNode[] children;
        boolean eow;
        TrieNode(){
            children=new TrieNode[26];
            eow=false;
        }
    }
     
    
    TrieNode root;
    public MagicDictionary() {
        root=new TrieNode();
    }
    
    public void buildDict(String[] dictionary) {
       
        
        for(String s:dictionary){
             TrieNode node=root;
            for(char ch:s.toCharArray()){
                if(node.children[ch-'a']==null){
                    node.children[ch-'a']=new TrieNode();
                }
                node=node.children[ch-'a'];
            }
            node.eow=true;
        }
    }
    
    public boolean search(String word) {
        char[] arr=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            //check every character possibility
            for(char ch='a';ch<='z';ch++){
                
                if(ch==arr[i]){
                    continue;
                }
                char org=arr[i];
                arr[i]=ch;
                String temp=new String(arr);
                if(helperSearch(temp)==true){
                    return true;
                }
                arr[i]=org;
                
            }
        }
        return false;
        
    }
    
    public boolean helperSearch(String word){
        TrieNode node=root;
        for(char ch:word.toCharArray()){
            if(node.children[ch-'a']==null){
                return false;
            }
            node=node.children[ch-'a'];
        }
        return node.eow;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */