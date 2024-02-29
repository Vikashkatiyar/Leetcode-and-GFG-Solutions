class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int val : map.values()){
            if(val>2) return false;
        }

        return true;
    }
}