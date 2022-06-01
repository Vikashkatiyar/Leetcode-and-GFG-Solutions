class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
       //TC:O(n)
        //SC:O(1)
        int res=0;
        for(int val1:arr1){
            int count=0;
            for(int val2:arr2){
                if(Math.abs(val1-val2)<=d){
                    count++;
                }
            }
            if(count==0){
                res++;
            }
        }
        return res;
    }
}