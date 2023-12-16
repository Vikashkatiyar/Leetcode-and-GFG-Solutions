class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int maxFreq=0;
        int right=0;
        int n=nums.size();
        int left=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        
        while(right<n){
            int num=nums.get(right);
            map.put(num, map.getOrDefault(num,0)+1);
            maxFreq=Math.max(maxFreq, map.get(num));
            
            if(right-left+1-maxFreq>k){
                map.put(nums.get(left), map.get(nums.get(left))-1);
                left++;
            }
            
            right++;
        }
        
        return maxFreq;
    }
}