class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remainder=((nums[i]%value)+value)%value;
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        
        
        int ans=0;
        while(true){
            int currRem=ans%value;
            if(map.containsKey(currRem)){
                map.put(currRem,map.get(currRem)-1);
                if(map.get(currRem)==0){
                    map.remove(currRem);
                }
            }else{
                return ans;
            }
            ans++;
        }
        
    }
}