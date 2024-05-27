class Solution {
    public int specialArray(int[] nums) {
        int[] bucket=new int[1001];
        for(int num:nums){
            bucket[num]++;
        }
        
        int totalNum=nums.length;
        
        for(int i=0;i<1001;i++){
            if(i==totalNum){
                return i;
            }
            
            totalNum-=bucket[i];
        }
        return -1;
        
        
    }
}