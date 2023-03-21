class Solution {
    public int slidingPuzzle(int[][] board) {
        //There is only one test case
        
        String target="123450";
        
        //Making initial String
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                sb.append(board[i][j]);
            }
        }
        String initial=sb.toString();
        
        
        int[][] swapIdx= {{1, 3}, {0, 2, 4}, {1, 5}, {0, 4}, {1, 3, 5}, {2, 4}};
        
        //Simple BFS
        
        LinkedList<String> q=new LinkedList<>();
        HashSet<String> vis=new HashSet<>();
        q.addLast(initial);
        vis.add(initial);
        int level=0;
        
        while(q.size()>0){
            int size=q.size();
            
            while(size-->0){
                String rem=q.removeFirst();
                
                //check
                if(rem.equals(target)){
                    return level;
                }
                
                //find the index of 0
                int idx=-1;
                for(int i=0;i<rem.length();i++){
                    if(rem.charAt(i)=='0'){
                        idx=i;
                        break;
                    }
                }
                
                // swap 0 with possible locations Stored in swapIdx
                
                int[] swap=swapIdx[idx];
                for(int i=0;i<swap.length;i++){
                    String toBeAdded=swapChar(rem,idx,swap[i]);
                    if(vis.contains(toBeAdded)){
                        continue;
                    }
                    q.addLast(toBeAdded);
                    vis.add(toBeAdded);
                }
            }
            level++;
        }
        return -1;
    }
    
    public String swapChar(String s,int i,int j){
        StringBuilder sb=new StringBuilder(s);
        sb.setCharAt(i,s.charAt(j));
        sb.setCharAt(j,s.charAt(i));
        
        return sb.toString();
        
    }
}