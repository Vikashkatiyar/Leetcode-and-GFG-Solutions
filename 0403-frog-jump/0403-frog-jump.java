class Solution {
    // TC:n*Max(no of Steps)
    public boolean canCross(int[] stones) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int stone:stones){
            map.put(stone,new HashSet<>());
        }
        
        map.get(0).add(1);
        for(int i=0;i<stones.length-1;i++){
            int stone=stones[i];
            
            for(int step:map.get(stone)){
               // System.out.println(map.get(stone));
                int reach=step+stone;
                
                if(reach==stones[stones.length-1]){
                    return true;
                }
                else if(map.containsKey(reach)){
                    HashSet<Integer> steps=map.get(reach);
                    
                    
                    if(step-1>0){
                        steps.add(step-1);
                    }
                    steps.add(step);
                    steps.add(step+1);
                    
                }
            }
        }
        
        return false;
    }
}