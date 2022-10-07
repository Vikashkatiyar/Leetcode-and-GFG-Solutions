class Solution {
    //O(nlogn)
    //compare the tail of every list
    public int lengthOfLIS(int[] nums) {
        int len=1;
        int []tails=new int[nums.length];
        tails[0]=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>tails[len-1]){
                len++;
                tails[len-1]=nums[i];
            }else{
                int idx=Arrays.binarySearch(tails,0,len-1,nums[i]);
                //it gives me the right position no of the element if exist then +ve or +ve not index so index=index-1
                if(idx<0){
                    idx=-idx;
                    idx=idx-1;
                }
                tails[idx]=nums[i];
            }
        }
        return len;
    }
}