//O(m*n)
//O(m*n)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        if(m==0){
            return new int[]{};
        }
        
        int n=mat[0].length;
        if(n==0){
            return new int[]{};
        }
        
        int []ans=new int[m*n];
        
        int row=0;
        int col=0;
        for(int i=0;i<m*n;i++){
            ans[i]=mat[row][col];
            if((row+col)%2==0){//even sum means up  row-- col++
                if(col==n-1){
                    row++;
                }else if(row==0){
                    col++;
                }else{
                    row--;
                    col++;
                }
            }else{
                //odd sum mean down
                if(row==m-1){
                    col++;
                }
                else if(col==0){
                    row++;
                }else{
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}