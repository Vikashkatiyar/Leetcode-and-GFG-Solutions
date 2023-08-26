class Solution {
    public int minimumOperations(List<Integer> nums) {
         //convert this problem in Standard LIS (longest increasing Subsequences ) problem
         //find the LIS it fix these elemets now change all other elements that is tha ans
        
        int n=nums.size();
        int[] lis=new int[n];
        Arrays.fill(lis,1);
        
        int maxLen=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums.get(i)>=nums.get(j)){
                    lis[i]=Math.max(lis[i],lis[j]+1);
                    maxLen=Math.max(lis[i],maxLen);
                }
            }
        }
        
        return n-maxLen;
    }
}