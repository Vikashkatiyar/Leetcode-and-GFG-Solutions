class Solution {
    
    private boolean isValidDiff(int r,int c){
        if((r==1 && c==2) || (r==2 && c==1)){
            return true;
        }
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0){
            return false;
        }
        int n=grid.length;
        Map<Integer,Pair<Integer,Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map.put(grid[i][j],new Pair(i,j));
            }
        }
        
        int currR=map.get(0).getKey();
        int currC=map.get(0).getValue();
        for(int i=1;i<n*n;i++){
            int row=map.get(i).getKey();
            int col=map.get(i).getValue();
            
            int diffR=Math.abs(currR-row);
            int diffC=Math.abs(currC-col);
            
            if(isValidDiff(diffR,diffC)==false){
                return false;
            }
            
            currR=row;
            currC=col;
        }
        
        return true;
    }
}