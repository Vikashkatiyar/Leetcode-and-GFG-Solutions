class Solution {
    public boolean canThreePartsEqualSum(int[] nums) {
        int sum=0;
        for(int a:nums){
            sum+=a;
        }
        
       
        if(sum%3!=0){ //if sum is not divisible by 3 then three parts not possible
            return false;
        }
        
        
        int sum1=sum/3;
        int count=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum2+=nums[i];
            
            if(sum2==sum1){
                sum2=0;
                count++;
            }
             
        }
        
        
        if(count>=3){
            return true;
        }else{
            return false;
        }
    }
}