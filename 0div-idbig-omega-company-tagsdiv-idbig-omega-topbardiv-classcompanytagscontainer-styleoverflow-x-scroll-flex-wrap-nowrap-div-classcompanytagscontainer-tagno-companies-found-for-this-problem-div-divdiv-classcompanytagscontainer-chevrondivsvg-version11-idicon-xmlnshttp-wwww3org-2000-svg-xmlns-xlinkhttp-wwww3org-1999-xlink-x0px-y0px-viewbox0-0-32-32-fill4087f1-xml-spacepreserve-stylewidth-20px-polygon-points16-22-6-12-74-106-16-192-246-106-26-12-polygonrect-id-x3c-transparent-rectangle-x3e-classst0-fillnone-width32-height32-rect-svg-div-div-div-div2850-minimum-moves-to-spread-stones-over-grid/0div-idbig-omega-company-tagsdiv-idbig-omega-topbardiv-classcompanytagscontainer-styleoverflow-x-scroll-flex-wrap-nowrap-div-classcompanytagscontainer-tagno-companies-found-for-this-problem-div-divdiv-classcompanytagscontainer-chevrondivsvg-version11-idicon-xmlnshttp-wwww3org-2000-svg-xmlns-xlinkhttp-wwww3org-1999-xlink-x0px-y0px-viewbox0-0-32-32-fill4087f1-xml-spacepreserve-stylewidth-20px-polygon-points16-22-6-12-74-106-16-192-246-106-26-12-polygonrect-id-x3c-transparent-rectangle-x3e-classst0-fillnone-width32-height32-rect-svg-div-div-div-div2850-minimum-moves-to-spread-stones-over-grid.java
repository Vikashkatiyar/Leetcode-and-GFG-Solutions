class Solution {
    //Brute Force
    public int minimumMoves(int[][] grid) {
        List<Pair<Integer,Integer>> zeros,extras;
        zeros=new ArrayList<>();
        extras=new ArrayList<>();
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[i][j]==0){
                    zeros.add(new Pair(i,j));
                }else if(grid[i][j]>1){
                    extras.add(new Pair(i,j));
                }
            }
        }
        
        int res=helper(grid,zeros,extras,0);
        return res;
    }
    
    public int helper(int[][] grid,List<Pair<Integer,Integer>> zeros, List<Pair<Integer,Integer>> extras, int currIdx){
        if(currIdx==zeros.size()){
            return 0;
        }
        int n=extras.size();
        int ans=1000000;
        int currZeroX=zeros.get(currIdx).getKey();
        int currZeroY=zeros.get(currIdx).getValue();
        
        for(int i=0;i<n;i++){
            int currX=extras.get(i).getKey();
            int currY=extras.get(i).getValue();
            
            if(grid[currX][currY]>1){
                grid[currX][currY]--;
                grid[currZeroX][currZeroY]=1;
                
                ans=Math.min(ans,Math.abs(currZeroX-currX)+Math.abs(currZeroY-currY)+helper(grid,zeros,extras,currIdx+1));
                
                grid[currX][currY]++;
                grid[currZeroX][currZeroY]=0;
                
            }
            
        }
        
        return ans;
    }
}