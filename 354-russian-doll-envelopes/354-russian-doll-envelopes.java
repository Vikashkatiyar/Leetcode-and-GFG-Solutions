class Solution {
    //O(nlogn)
    //compare tail element of the lists-> lis based
    public int maxEnvelopes(int[][] nums) {
        Arrays.sort(nums,(a,b)->{
                   if(a[0]!=b[0])
                        return a[0]-b[0];
                    else
                       return b[1]-a[1];
        });
        
        int len=1;
        int [] tails=new int[nums.length];
        tails[0]=nums[0][1];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i][1]>tails[len-1]){
                len++;
                tails[len-1]=nums[i][1];
            }else{
                int idx=Arrays.binarySearch(tails,0,len-1,nums[i][1]);
                if(idx<0){
                    idx=-idx;
                    idx=idx-1;
                }
                tails[idx]=nums[i][1];
            }
        }
        return len;
                      
    }
}