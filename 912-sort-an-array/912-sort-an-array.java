class Solution {
    public int[] sortArray(int[] nums) {
        // Arrays.sort(nums);
        // return nums;
        
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int val:nums){
            pq.add(val);
        }
        int i=0;
        while(!pq.isEmpty()){
            nums[i]=pq.remove();
            i++;
        }
        return nums;
    }
}