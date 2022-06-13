class Solution {
    public int majorityElement(int[] nums) {
       //Moore Voting Algorithum
        //O(n)
        //O(1)
        int count=0;
        int candidate=0;
        
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            
            if(num==candidate) count+=1;
            else count-=1;
        }
        return candidate;
        
    }
}