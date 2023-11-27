class Solution {
    //Jai Shree Ram
    public int equalPairs(int[][] grid) {
        int n=grid.length; //n*n
        Map<String, Integer> map=new HashMap<>();
        
        for(int[] row: grid){
            //map.merge(Arrays.toString(row),1,(a,b)->a+b) ; //same
            
            // String key = Arrays.toString(row);
            // map.put(key, 1 + map.getOrDefault(key, 0)); //same
            
            
            map.merge(Arrays.toString(row),1,Integer::sum) ;
        }
        
        int pairs=0;
        for(int c=0;c<n;c++){
            int[] col=new int[n];
            for(int r=0;r<n;r++){
                col[r]=grid[r][c];
            }
            
            pairs+=map.getOrDefault(Arrays.toString(col),0);
        }
        
        return pairs;
    }
}