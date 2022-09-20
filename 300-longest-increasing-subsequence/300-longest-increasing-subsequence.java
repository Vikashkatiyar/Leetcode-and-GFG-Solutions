class Solution {
    //O(n2)
    public int lengthOfLIS(int[] nums) {
        int[] lis=new int[nums.length];
        lis[0]=1;
        
        for(int i=1;i<nums.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i])
                  max=Math.max(max,lis[j]);
            }
            lis[i]=max+1;
        }
        
        int res=0;
        for(int val : lis){
            res=Math.max(res,val);
        }
        return res;
    }
}