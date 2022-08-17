class Solution {
    //O(n)
    //O(1)
    public int partitionDisjoint(int[] nums) {
        int pi=0;
        
        int mtp=nums[0];
        int mts=nums[0];
        
        for(int i=1;i<nums.length;i++){
            mts=Math.max(mts,nums[i]);
            
            if(nums[i]<mtp){
                pi=i;
                mtp=mts;
            }
        }
       return pi+1; 
    }
}




// //O(n)
//     //O(n);
//     public int partitionDisjoint(int[] nums) {
//         int []left=new int[nums.length];
//         int []right=new int[nums.length];
        
        
//         for(int i=0;i<nums.length;i++){//fill with max numbers
//             if(i==0)
//                 left[i]=nums[i];
//             else
//                 left[i]=Math.max(nums[i],left[i-1]);
//         }
        
        
//         for(int i=nums.length-1;i>=0;i--){//fill with minimum numbers
//             if(i==nums.length-1)
//                 right[i]=nums[i];
//             else
//                 right[i]=Math.min(nums[i],right[i+1]);
//         }
        
        
//         int ans=0;
//         for(int i=0;i<nums.length-1;i++){
//             if(left[i]<=right[i+1]){
//                 ans=i+1;
//                 break;
//             }
//         }
        
//         return ans;
//     }