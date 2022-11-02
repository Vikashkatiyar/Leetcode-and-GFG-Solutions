class Solution {
    // refer->https://www.youtube.com/watch?v=9JLJxat4xhA
    
    public int destroyTargets(int[] nums, int space) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int num:nums){
            int rem=num%space;
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        int max=Collections.max(map.values());
        Arrays.sort(nums);
        for(int num:nums){
            if(map.get(num%space)==max){
                return num;
            }
        }
        return nums[0];
    }
}