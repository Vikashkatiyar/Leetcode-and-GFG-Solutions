class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=0;
        int count1=0;
        
        int cand2=0;
        int count2=0;
        
        for(int num:nums){
            if(num==cand1)   
                count1++;
            else if(num==cand2)
                count2++;
            else if(count1==0){
                count1++;
                cand1=num;
            }
            else if(count2==0){
                count2++;
                cand2=num;
            }else{
                count1--;
                count2--;
            }
        }
        
        
        count1=0;
        count2=0;
        ArrayList<Integer> list=new ArrayList<>();
         for(int val:nums){   //cross checking 
             if(val==cand1){
                 count1++;
             }else if(val==cand2){
                 count2++;
             }
         }
        
        if(count1>nums.length/3){
            list.add(cand1);
        }
        if(count2>nums.length/3){
            list.add(cand2);
        }
        return list;
    }
}