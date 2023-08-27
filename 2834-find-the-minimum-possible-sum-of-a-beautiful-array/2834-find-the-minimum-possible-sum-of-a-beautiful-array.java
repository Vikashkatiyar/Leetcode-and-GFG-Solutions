class Solution {
    public long minimumPossibleSum(int n, int target) {
        long ans=0;
        int i=0;
        Set<Integer> set=new HashSet<>();
        int num=1;
        while(i<n){
            int pair=target-num;
            if(!set.contains(pair)){
                set.add(num);
                ans+=num;
                i++;
            }
            num++;
        }
        
        return ans;
    }
}