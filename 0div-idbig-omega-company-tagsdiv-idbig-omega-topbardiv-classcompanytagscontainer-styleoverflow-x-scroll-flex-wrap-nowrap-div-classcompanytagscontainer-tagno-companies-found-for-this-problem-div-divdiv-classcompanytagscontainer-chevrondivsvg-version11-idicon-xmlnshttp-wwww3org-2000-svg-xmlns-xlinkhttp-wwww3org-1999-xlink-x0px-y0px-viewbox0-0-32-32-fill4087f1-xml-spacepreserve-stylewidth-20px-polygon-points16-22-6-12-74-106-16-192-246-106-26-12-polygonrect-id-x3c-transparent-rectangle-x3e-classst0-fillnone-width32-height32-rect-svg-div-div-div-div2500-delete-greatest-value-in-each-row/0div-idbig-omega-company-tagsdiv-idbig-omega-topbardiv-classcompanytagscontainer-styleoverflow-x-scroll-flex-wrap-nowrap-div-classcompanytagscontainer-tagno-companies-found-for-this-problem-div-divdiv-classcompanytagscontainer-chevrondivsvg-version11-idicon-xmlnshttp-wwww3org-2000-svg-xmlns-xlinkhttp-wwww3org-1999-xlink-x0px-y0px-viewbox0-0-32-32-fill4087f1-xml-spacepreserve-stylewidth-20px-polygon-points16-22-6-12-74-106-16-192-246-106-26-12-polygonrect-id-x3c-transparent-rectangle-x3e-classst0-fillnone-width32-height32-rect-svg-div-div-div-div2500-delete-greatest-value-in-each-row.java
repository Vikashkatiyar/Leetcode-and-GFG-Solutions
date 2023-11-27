class Solution {
    //Jai Shree Ram
    public int deleteGreatestValue(int[][] grid) {
        //O(m*n*(nlogn))
        //O(1)
        for(int []row:grid){
            Arrays.sort(row);
        }
        
        int maxSum=0;
        
        for(int j=0;j<grid[0].length;j++){
            int colSum=0;
            for(int i=0;i<grid.length;i++){
                colSum=Math.max(colSum,grid[i][j]);
            }
            maxSum+=colSum;
        }
        
        return maxSum;
    }
}