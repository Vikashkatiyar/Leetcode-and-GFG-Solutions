class Solution {
    // LC-75
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        
       //Left prefix
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i]=1;
            }else{
                ans[i]=ans[i-1]*nums[i-1];
            }
        }
        
        //right suffix 
        int right=1;
        for(int i=nums.length-2;i>=0;i--){
            right=right*nums[i+1];
            
            ans[i]=ans[i]*right;
        }
        
        return ans;
    }
}