class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        
        for(int num:nums){
           
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>(map.keySet());
        
        Collections.sort(list,(a,b)->{
            return (map.get(a)==map.get(b)?b-a:map.get(a)-map.get(b));
        });
        
        int []ans=new int[nums.length];
        int i=0;
        for(int num:list){
            for (int j = 0; j < map.get(num); j++) {
                ans[i] = num;
                i++;
            }
        }
        return ans;
    }
}