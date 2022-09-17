class Solution {
    public long interchangeableRectangles(int[][] nums) {
        long res=0;
        HashMap<Double,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Double div=(double)nums[i][0]/nums[i][1];
            map.put(div,map.getOrDefault(div,0)+1);
        }
        
        for(Double key:map.keySet()){
            if(map.get(key)>1){
                int count=map.get(key);
                res+=(long)count*(count-1)/2;
            }
        }
        
        return res;
    }
}