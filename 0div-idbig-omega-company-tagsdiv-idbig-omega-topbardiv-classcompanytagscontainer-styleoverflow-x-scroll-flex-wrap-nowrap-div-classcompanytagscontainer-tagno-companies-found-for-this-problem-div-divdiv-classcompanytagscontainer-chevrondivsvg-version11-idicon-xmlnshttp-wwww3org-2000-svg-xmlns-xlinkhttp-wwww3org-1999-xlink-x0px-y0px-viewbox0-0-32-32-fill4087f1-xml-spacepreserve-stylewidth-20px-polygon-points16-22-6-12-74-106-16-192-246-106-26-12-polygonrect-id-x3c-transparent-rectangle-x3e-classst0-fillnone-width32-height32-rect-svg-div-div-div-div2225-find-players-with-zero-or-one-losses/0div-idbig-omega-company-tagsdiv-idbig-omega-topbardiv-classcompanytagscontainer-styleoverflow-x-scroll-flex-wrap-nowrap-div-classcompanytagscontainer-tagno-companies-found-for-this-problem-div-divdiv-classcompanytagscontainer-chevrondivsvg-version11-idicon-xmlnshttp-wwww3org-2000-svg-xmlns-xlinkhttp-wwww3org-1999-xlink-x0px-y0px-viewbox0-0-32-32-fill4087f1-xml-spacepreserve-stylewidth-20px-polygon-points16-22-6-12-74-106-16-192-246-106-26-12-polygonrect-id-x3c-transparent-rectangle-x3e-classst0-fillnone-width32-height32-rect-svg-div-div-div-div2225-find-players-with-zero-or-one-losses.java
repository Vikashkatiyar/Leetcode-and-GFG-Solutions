class Solution {
    //Jai Shree Ram
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map=new HashMap<>();
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> wList=new ArrayList<>();
        List<Integer> lList=new ArrayList<>();
        
        
        for(int[] mat: matches){
            if(!map.containsKey(mat[0])){
                map.put(mat[0],0);
            }
            
            
            map.put(mat[1], map.getOrDefault(mat[1],0)+1);
        }
        
        for(int key: map.keySet()){
            if(map.get(key)==0){
                wList.add(key);
            }
            
            if(map.get(key)==1){
                lList.add(key);
            }
        }
        
        Collections.sort(wList);
        Collections.sort(lList);
        
        ans.add(wList);
        ans.add(lList);
        
        return ans;
        
        
    }
}