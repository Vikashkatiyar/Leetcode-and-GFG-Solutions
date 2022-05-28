class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer>rowZero =new ArrayList<>();
        List<Integer> colZero=new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]==0){
                        rowZero.add(i);
                        colZero.add(j);
                    }
            }
        }
        
        
    for(int rowIdx:rowZero){
        makeRowZero(matrix,rowIdx);
    }
        
    for(int colIdx:colZero){
       makeColZero(matrix,colIdx);
    } 
        return;
        
}
 private void makeRowZero(int[][] matrix,int rIdx){
     for(int j=0;j<matrix[0].length;j++){
         matrix[rIdx][j]=0;
     }
 }  
    
 private void makeColZero(int[][] matrix,int cIdx){
     for(int j=0;j<matrix.length;j++){
         matrix[j][cIdx]=0;
     }
 }     
    
}