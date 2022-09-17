class Solution {
    //O(n2)
    public int triangleNumber(int[] nums) {
        int count=0;
        if(nums.length<3){
            return count;
        }
        
        Arrays.sort(nums);
        
        for(int i=2;i<nums.length;i++){
            int left=0;
            int right=i-1;
            
            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    count+=(right-left);
                    right--;
                }else{
                    left++;
                }
            }
        }
        return count;
    }
}