class Solution {
    public int findChampion(int n, int[][] edges) {
         Set<Integer> teams=new HashSet<>();
        for(int i=0;i<n;i++){
            teams.add(i);
        }
        
        for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];
            //u is camp in compare to u,v so remove v from campians
            teams.remove(v);
        }
        
        if(teams.size()>1){
            return -1;
        }
        
        Iterator<Integer> iter=teams.iterator();
        int champ=iter.next();
        return champ;
    }
}