//O(n)
//O(n)
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int start=0;
        int end=0;
        int runningSum=0;
        int maxSum=0;
        while(end<nums.length){
            int currEle=nums[end];
            if(!set.contains(currEle)){
                set.add(currEle);
                runningSum+=currEle;
                maxSum=Math.max(maxSum,runningSum);
                end++;
            }
            else{
                int delEle=nums[start];
                set.remove(delEle);
                runningSum=runningSum-delEle;
                start++;
            }
        }
        return maxSum;
    }
}