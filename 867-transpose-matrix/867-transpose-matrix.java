class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] trr=new int[m][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trr[j][i]=matrix[i][j];
            }
        }
        return trr;
    }
}