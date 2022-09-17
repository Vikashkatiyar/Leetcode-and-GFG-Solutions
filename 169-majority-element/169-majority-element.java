class Solution {
    public int majorityElement(int[] nums) {
       //Moore Voting Algorithum
        //O(n)
        //O(1)
        int ele=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                ele=num;
            }
            
            if(num==ele){
                count+=1;
            }else{
                count-=1;
            }
        }
        return ele;
        
    }
}