class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0,sum2=0,zero1=0,zero2=0;
        
        for(int num:nums1){
            sum1+=num;
            if(num==0){
                sum1++;
                zero1++;
            }
        }
        System.out.println(sum1);
        
        for(int num:nums2){
            sum2+=num;
            if(num==0){
                sum2++;
                zero2++;
            }
        }
        System.out.println(sum2);
        if(sum1==sum2){
            return sum1;
        }else if(sum1<sum2){
            if(zero1>0){
                return sum2;
            }else{
                return -1;
            }
        }else{
            if(zero2>0){
                return sum1;
            }else{
                return -1;
            }
        }
    }
}