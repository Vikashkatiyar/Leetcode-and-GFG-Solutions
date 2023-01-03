class Solution {
    class Node{
        boolean eow=false;
        Node []children =new Node[26];
    }
    Node root=new Node();
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
         
        //adding the word from words in trie
        for(String word:words){
            Node temp=root;
            for(char ch:word.toCharArray()){
                if(temp.children[ch-'a']==null){
                    temp.children[ch-'a']=new Node();
                }
                temp=temp.children[ch-'a'];
            }
            temp.eow=true;
        }
         
        //check given word is breakable in another words
        //if yes then add its in answer
        List<String> ans=new ArrayList<String>();
        for(String word:words){
            flag=false;
            wordbreak(word,0,0);
            if(flag==true)
                ans.add(word);
        }
        return ans;
    }
    
    
    
    
    boolean flag=false;
    void wordbreak(String word,int j,int wsf){
        if(word.length()==j){
            if(wsf>=2){  
                flag=true;
                return ;
            }
        }
        
        Node temp=root;
        for(int i=j;i<word.length();i++){ 
            char ch=word.charAt(i);
            if(temp.children[ch-'a']!=null){
                temp=temp.children[ch-'a'];
                if(temp.eow==true){
                   wordbreak(word,i+1,wsf+1);
                }
            }else{
                return;
            }
        }
    }
}