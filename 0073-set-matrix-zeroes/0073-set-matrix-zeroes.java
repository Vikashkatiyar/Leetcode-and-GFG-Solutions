class Solution {
    public void setZeroes(int[][] mat) {
        
        int row=mat.length;
        int col=mat[0].length;
        
        boolean[] rowArr=new boolean[row];
        boolean[] colArr=new boolean[col];
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    rowArr[i]=true;
                    colArr[j]=true;
                }
            }
        }
        
        for(int i=0;i<mat.length;i++){
            if(rowArr[i]==true){
                for(int j=0;j<mat[0].length;j++){
                    mat[i][j]=0;
                }
            }
            
        }
        
        for(int j=0;j<mat[0].length;j++){
            if(colArr[j]==true){
                for(int i=0;i<mat.length;i++){
                    mat[i][j]=0;
                }
            }
        }
    }
}