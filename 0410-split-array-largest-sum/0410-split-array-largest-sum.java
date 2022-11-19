class Solution {
    public int splitArray(int[] nums, int m) {
        int hi=0;
        int lo=Integer.MIN_VALUE;
        for(int num:nums){
            hi+=num;
            lo=Math.max(num,lo);
        }
        
        
       
        while(lo<hi){
            int mid=(lo+hi)/2;
            
            if(isPossible(nums,mid,m)==true){
                
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }
    public boolean isPossible(int []arr,int mid,int m){
        int sum=0;
        int student=1;
        for(int num:arr){
            sum+=num;
            if(sum>mid){
                sum=num;
                student++; 
            }
        }
        
        return student<=m;
    }
}