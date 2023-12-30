class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set=new HashSet<>();
        int count=0;
        
        
        for(int num : nums){
            if(set.contains(num-diff) && set.contains(num-diff*2)){
                count++;
            }    
            set.add(num);
        }
        
        return count;
    }
}