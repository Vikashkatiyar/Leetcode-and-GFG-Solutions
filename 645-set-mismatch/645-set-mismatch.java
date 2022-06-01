class Solution {
    public int[] findErrorNums(int[] nums) {
      HashSet<Integer> h=new HashSet<>();
        
        int dup=0;
        for(int val: nums){
            if(h.contains(val)){
                dup=val;
            }
            h.add(val);
        }
        
        
        
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i)){
                return new int[]{dup,i};
            }
        }
        return new int[]{};
    }
}