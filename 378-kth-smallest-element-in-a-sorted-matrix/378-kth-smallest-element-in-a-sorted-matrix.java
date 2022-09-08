class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int lo=mat[0][0];
        int hi=mat[mat.length-1][mat[0].length-1];
        
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            
            //count
            int count=0;
            int j=mat[0].length-1;
            for(int i=0;i<mat.length;i++){
                while(j>=0 && mat[i][j]>mid){
                    j--;
                }
                count+=(j+1);
            }
            
            
            if(count<k){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
        
    }
}