class Solution {
    public int maxFrequencyElements(int[] nums) {
        int [] count=new int[101];
        int maxCount=0, occ=0;
        
        for(int num: nums){
            int current=++count[num];
            
            if (current >= maxCount) {
                occ = (current > maxCount) ? 1 : occ+1;
                maxCount = current;
            }
        }
        
        return occ*maxCount;
    }
}