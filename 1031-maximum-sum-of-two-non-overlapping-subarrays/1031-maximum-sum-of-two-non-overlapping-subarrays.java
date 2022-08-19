class Solution {
    //tc:O(n)
    //SC:O(n)
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int max1=getMax(nums,firstLen,secondLen);
        int max2=getMax(nums,secondLen,firstLen);
        return Math.max(max1,max2);
    }
    
    public int getMax(int[] nums,int f,int s){
        int []left=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i==f-1){
                left[i]=sum;
            }else if(i>f-1){
                sum-=nums[i-f];
                left[i]=Math.max(sum,left[i-1]);
            }
        }
        
        sum=0;
        int []right=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            sum+=nums[i];
            if(i==nums.length-s){
                right[i]=sum;
            }else if(i<nums.length-s){
                sum-=nums[i+s];
                right[i]=Math.max(sum,right[i+1]);
            }
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=f-1;i<nums.length-s;i++){
            max=Math.max(max,left[i]+right[i+1]);
        }
        return max;
    }
}