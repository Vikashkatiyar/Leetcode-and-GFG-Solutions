class Solution {
    
    private static class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    
    public int[][] updateMatrix(int[][] mat) {
        LinkedList<Pair> q=new LinkedList<>();
        
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.addLast(new Pair(i,j));
                }else{
                    mat[i][j]=-1;
                }
            }
        }
        
        
        while(q.size()>0){
            Pair rem=q.removeFirst();
            
            for(int i=0;i<4;i++){
                int rowDash = rem.x+dir[i][0];
                int colDash = rem.y+dir[i][1];
                
                if(rowDash>=0 && colDash>=0 && rowDash<mat.length && colDash <mat[0].length && mat[rowDash][colDash]<0){
                    q.add(new Pair(rowDash,colDash));
                    mat[rowDash][colDash]=mat[rem.x][rem.y]+1;
                }
            }
        }
        
        return mat;
        
    }
}