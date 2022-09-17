class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=i-nums[i];
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        
        long total_pairs=(long)nums.length*(nums.length-1)/2;
        long good_pairs=0L;
        for(int key:map.keySet()){
            int val=map.get(key);
            if(val>1){
                long value=val;
                good_pairs+=value*(value-1)/2;
            }
        }
        
        return total_pairs-good_pairs;
    }
}