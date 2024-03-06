class Solution {
    public int maxProduct(int[] nums) {
        int pd=1;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            pd=pd*nums[i];
            if(pd>res){
                res=pd;
            }
            
            if(pd==0){
                pd=1;
            }
        }
        
        pd=1;
        for(int i=nums.length-1;i>=0;i--){
             pd=pd*nums[i];
            if(pd>res){
                res=pd;
            }
            
            if(pd==0){
                pd=1;
            }
        }
        
        return res;
    }
}