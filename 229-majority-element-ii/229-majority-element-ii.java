class Solution {
    public List<Integer> majorityElement(int[] nums) {
      //Bayers Moore Voting Algorithum
        //O(N)+O(N)
        //o(1)
        int num1=-1;
        int num2=-1;
        int count1=0;
        int count2=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1)
                count1++;
            else if(nums[i]==num2)
                count2++;
            else if(count1==0){
                num1=nums[i];
                count1=1;
            }
            else if(count2==0){
                num2=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
            
            ArrayList<Integer> list=new ArrayList<>();
            count1=0;
            count2=0;
            
            for(int num:nums){
                if(num==num1)
                    count1++;
                else if(num==num2)
                    count2++;
            }
            
            if(count1>nums.length/3){
                list.add(num1);
            }
            if(count2>nums.length/3){
                list.add(num2);
            }
         
        
         return list;
    }
}