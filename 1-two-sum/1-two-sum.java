

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int goal=target-nums[i];
            if(map.containsKey(goal)){
                return new int[]{i,map.get(goal)};
            }
            else{
                map.put(nums[i],i);
            }
        }
        
        return null;
    }
}