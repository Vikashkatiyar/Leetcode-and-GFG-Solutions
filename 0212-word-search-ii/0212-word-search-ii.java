class Solution {
    class Node{
        boolean eow=false;
        Node []children=new Node[26];
    }
    Node root=new Node();
    public List<String> findWords(char[][] board, String[] words) {
        //adding words into trie
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
        
        boolean[][] vis=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                helper(board,vis,i,j,new StringBuilder(),root);
            }
        }
        return new ArrayList<>(res);
    }
    
    int[][] dirs={{0,-1},{0,1},{1,0},{-1,0}}; //all four direction
    HashSet<String> res=new HashSet<>();
    
    void helper(char [][]board,boolean[][]vis,int i,int j,StringBuilder sb,Node node)
    {
        char ch=board[i][j];
        sb.append(ch);
         
        
        //searching continue in parallel 
        if(node.children[ch-'a']==null){//if we are in wrong path then return from here not call further
            sb.deleteCharAt(sb.length()-1);
            return ;
        }
        Node child=node.children[ch-'a'];
        if(child.eow){
            res.add(sb.toString());
        }
        
        
        //main logic 
        vis[i][j]=true;
        for(int[] dir:dirs){ //move all four directions
            int ii=i+dir[0];
            int jj=j+dir[1];
            if(ii>=0 && ii<board.length && jj>=0 && jj<board[0].length && vis[ii][jj]==false){
                helper(board,vis,ii,jj,sb,child);
            }
        }
        vis[i][j]=false;
        sb.deleteCharAt(sb.length()-1);
    }
}