class Solution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);

        int cnt=0;
        int n=nums.size();
        if(nums.get(0)!=0){
            cnt++;
        }
            
        for(int i=0;i<n-1;i++){
            if(nums.get(i)<(i+1) && (nums.get(i+1)>(i+1))){
                cnt++;
            }
        }

        if(n>nums.get(n-1)){
            cnt++;
        }


        return cnt;
    }
}