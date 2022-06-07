import java.util.HashMap;
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
         
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        
        
        for (int i=0;i< operations.length;i++){
            int index=mp.get(operations[i][0]);
            nums[index]=operations[i][1];
            mp.remove(operations[i][0]);
            mp.put(operations[i][1],index);
        }
        return nums;
    }
}