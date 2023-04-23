class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        
        int top=0,bottom=r-1;
       int left=0,right=c-1;
       List<Integer> list=new ArrayList<>();
       
       while(top<=bottom && left<=right){
           
           // row forward
           for(int i=left;i<=right;i++){
               list.add(mat[top][i]);
           }
           top++;
           if(top>bottom){
               break;
           }
           
           //col downward
           for(int i=top;i<=bottom;i++){
               list.add(mat[i][right]);
           }
           right--;
           if(left>right){
               break;
           }
           
           //row backward
           for(int i=right;i>=left;i--){
               list.add(mat[bottom][i]);
           }
           bottom--;
           
           
           //col upword
           for(int i=bottom;i>=top;i--){
               list.add(mat[i][left]);
           }
           left++;
       }
       return list;
    }
}