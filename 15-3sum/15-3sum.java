class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){			
			// this condition will take care of duplicate a
           if(i==0||i>0 && nums[i]!=nums[i-1]){
               int left=i+1, right=nums.length-1;
               int target=-nums[i];
               while(left<right){
                   if(nums[left]+nums[right]==target){
					   // adding a,b and c in the answer list
                       ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                       left++;
                       right--;
                       
					   // this condition will take care of duplicate b
                       while(left<right && nums[left]==nums[left-1])
                           left++;
					   // this condition will take care of duplicate c
                       while(left<right && nums[right]==nums[right+1])
                           right--;
                   }
                   else if(nums[left]+nums[right]<target)
                        left++;
                   else
                       right--;            
               }
           }         
        }
             return ans;
    }
}