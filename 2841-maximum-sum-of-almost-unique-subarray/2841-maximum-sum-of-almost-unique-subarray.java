class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long maxSum=0;
        long currSum=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<k;i++){
            currSum+=nums.get(i);
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        if(map.size()>=m){
            maxSum=Math.max(maxSum,currSum);
        }
        
        for(int i=k;i<nums.size();i++){

            currSum-=nums.get(i-k);;
            map.put(nums.get(i-k),map.get(nums.get(i-k))-1);
            if(map.get(nums.get(i-k))==0){
                map.remove(nums.get(i-k));
            }
            
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
            currSum+=nums.get(i);
            
            if(map.size()>=m){
                 maxSum=Math.max(maxSum,currSum);
            }
            
            
        }
        
        return maxSum;
    }
}