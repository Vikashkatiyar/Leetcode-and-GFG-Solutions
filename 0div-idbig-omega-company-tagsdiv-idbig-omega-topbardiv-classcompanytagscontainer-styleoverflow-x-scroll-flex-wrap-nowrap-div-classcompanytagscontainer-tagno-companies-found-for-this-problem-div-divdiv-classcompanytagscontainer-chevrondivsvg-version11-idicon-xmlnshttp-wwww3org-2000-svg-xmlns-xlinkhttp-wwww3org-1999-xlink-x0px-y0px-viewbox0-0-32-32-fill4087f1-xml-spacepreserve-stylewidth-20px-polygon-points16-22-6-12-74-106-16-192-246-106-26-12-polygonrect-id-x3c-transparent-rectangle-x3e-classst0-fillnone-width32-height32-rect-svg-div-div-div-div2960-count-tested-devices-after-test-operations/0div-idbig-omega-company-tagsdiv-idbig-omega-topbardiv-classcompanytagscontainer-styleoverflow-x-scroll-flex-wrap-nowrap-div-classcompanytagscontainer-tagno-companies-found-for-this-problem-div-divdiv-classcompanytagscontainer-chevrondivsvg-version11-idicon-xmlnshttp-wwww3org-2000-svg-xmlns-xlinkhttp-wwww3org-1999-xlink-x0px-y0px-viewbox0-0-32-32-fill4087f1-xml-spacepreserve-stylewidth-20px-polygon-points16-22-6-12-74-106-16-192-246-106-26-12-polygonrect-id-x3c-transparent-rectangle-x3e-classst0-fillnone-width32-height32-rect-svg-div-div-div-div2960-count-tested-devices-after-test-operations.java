class Solution {
    public int countTestedDevices(int[] nums) {
        int count=0;
        
        for(int num :nums){
            if(num > count){
                count++;
            }
        }
        
        return count;
    }
}