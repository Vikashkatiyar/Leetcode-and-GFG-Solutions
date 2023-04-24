class Solution {
    //jai baba bhole
    //sliding window but not original array 
    //sliding window run on freq array
    
    //do dry run for better understanding
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n=nums.length;
        int[] f=new int[101];
        int[] ans=new int[n-k+1];
        
        for(int i=0;i<k;i++){
            f[nums[i]+50]++;
        }
        
        for(int i=0;i<=n-k;i++){
            int count=0;
            int val=-1;
            for(int j=0;j<=49;j++){
                if(f[j]>0){
                    count+=f[j];
                    if(count>=x){
                        val=j;
                        break;
                    }
                }
                
            }
            f[nums[i]+50]--;
            if(i<n-k){
                f[nums[i+k]+50]++;
            }
            ans[i]=val == -1 ? 0 : val-50;
        }
        
        return ans;
    }
}