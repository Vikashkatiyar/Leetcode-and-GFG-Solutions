class Solution {
    public int findChampion(int[][] grid) {
        int n=grid.length;
        Set<Integer> teams=new HashSet<>();
        for(int i=0;i<n;i++){
            teams.add(i);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(grid[i][j]==1){
                        //team i is camp 
                       teams.remove(j);
                     }else{
                        //team j is champ
                       teams.remove(i);
                    }
                }
                
            }
        }
        
        Iterator<Integer> iter=teams.iterator();
        int champ=iter.next();
        return champ;
    }
}