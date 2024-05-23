class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean status = false;
        if(nums[0]%2==0){
            status = true;
        }
        for(int i=0;i<nums.length;i++){
            if(status){
                if(i%2==0){
                    if(nums[i]%2!=0){
                        return false;
                    }
                }else{
                    if(nums[i]%2==0){
                        return false;
                    }
                }
            }else{
                if(i%2==0){
                    if(nums[i]%2==0){
                        return false;
                    }
                }else{
                    if(nums[i]%2!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}