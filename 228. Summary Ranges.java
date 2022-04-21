class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        if(nums.length==0){
            return ans;
        }
        if(nums.length==1){
            ans.add(""+nums[0]);
            return ans;
        }
        int start=0;
        int i=0;
        while(start<nums.length && i<nums.length){
            if(i<nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            else{
                String subAns="";
                if(start==i){
                    subAns+=nums[start];
                }
                else{
                    subAns=nums[start]+"->"+nums[i];
                }
                ans.add(subAns);
                start=i+1;
                i++;
            }
        }
        return ans;
    }
}
//done
