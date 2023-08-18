class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        boolean [][]chess=new boolean[n][n];
        
        boolean []cols=new boolean[n];
        boolean [] nd=new boolean[2*n-1];
        boolean [] rd=new boolean[2*n-1];
        
        helper(chess,0,cols,nd,rd,res);
        return res;
        
    }
    
    public void helper(boolean [][] chess,int row,boolean[] cols,boolean []nd,boolean []rd,List<List<String>> res ){
        if(row==chess.length){
             List<String> temp=new ArrayList<>();
            for(int i=0;i<chess.length;i++){
               StringBuilder sb=new StringBuilder();
                for(int j=0;j<chess[0].length;j++){
                    if(chess[i][j]==true){
                        sb.append("Q");
                    }else{
                        sb.append(".");
                    }
                }
                temp.add(sb.toString());
                
            }
            res.add(temp);
            return;
            
        }
        
        for(int col=0;col<chess[0].length;col++){
            if(cols[col]==false && nd[row+col]==false && rd[row-col+chess.length-1]==false){
                chess[row][col]=true;
                cols[col]=true;
                nd[row+col]=true;
                rd[row-col+chess.length-1]=true;
                
                helper(chess,row+1,cols,nd,rd,res);
                
                chess[row][col]=false;
                cols[col]=false;
                nd[row+col]=false;
                rd[row-col+chess.length-1]=false;
            }
        }
    }
}