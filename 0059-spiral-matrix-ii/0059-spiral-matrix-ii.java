class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        int r=mat.length;
        int c=mat[0].length;
        
        int top=0,bottom=r-1;
        int left=0,right=c-1;
       
       int num=1;
       while(top<=bottom && left<=right){
           
           // row forward
           for(int i=left;i<=right;i++){
               mat[top][i]=num++;
           }
           top++;
           if(top>bottom){
               break;
           }
           
           //col downward
           for(int i=top;i<=bottom;i++){
               mat[i][right]=num++;
           }
           right--;
           if(left>right){
               break;
           }
           
           //row backward
           for(int i=right;i>=left;i--){
               mat[bottom][i]=num++;
           }
           bottom--;
           
           
           //col upword
           for(int i=bottom;i>=top;i--){
               mat[i][left]=num++;
           }
           left++;
       }
       return mat;
    }
}