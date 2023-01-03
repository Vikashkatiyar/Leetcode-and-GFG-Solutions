class Solution {
    class Node{
        boolean eow=false;
        Node []children=new Node[26];
    }
    String res="";
    public String longestWord(String[] words) {
        Node root=new Node();
         
        //adding words in trie
        for(String word:words){
            Node temp=root;
            for(char ch:word.toCharArray()){
                if(temp.children[ch-'a']==null)
                {
                    temp.children[ch-'a']=new Node();
                }
                temp=temp.children[ch-'a'];
            }
            temp.eow=true;
        }
        
        helper(root,new StringBuilder());
        return  res;
    }
     
    //traverse where * exist and end with a world
    public void helper(Node node,StringBuilder sb){
        if(sb.length()>res.length()){
            res=sb.toString();
        }
        
        for(char ch='a';ch<='z';ch++){
            Node child=node.children[ch-'a'];
            if(child!=null && child.eow==true){
                sb.append(ch);
                helper(child,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}