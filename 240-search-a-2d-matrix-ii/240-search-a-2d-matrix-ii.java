class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo=0;
        int hi=matrix[0].length-1;
        while(lo<matrix.length && hi>=0){
            if(matrix[lo][hi]==target){
                return true;
            }
            else if(matrix[lo][hi]>target){
                hi--;
            }
            else if(matrix[lo][hi]<target){
                lo++;
            }
        }
        return false;
    }
}