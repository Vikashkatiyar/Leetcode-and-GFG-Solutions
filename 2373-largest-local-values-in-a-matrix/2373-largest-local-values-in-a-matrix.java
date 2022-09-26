class Solution {
    public int[][] largestLocal(int[][] grid) {
        int [][]ans=new int[grid.length-2][grid.length-2];
        
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                ans[i][j]=maxValue(grid,i,j);
            }
        }
        return ans;
    }
    
    public int maxValue(int [][]grid,int l,int r){
        
        int max=Integer.MIN_VALUE;
        for(int i=l;i<l+3;i++){
            for(int j=r;j<r+3;j++){
                max=Math.max(grid[i][j],max);
            }
        }
        return max;
    }
}