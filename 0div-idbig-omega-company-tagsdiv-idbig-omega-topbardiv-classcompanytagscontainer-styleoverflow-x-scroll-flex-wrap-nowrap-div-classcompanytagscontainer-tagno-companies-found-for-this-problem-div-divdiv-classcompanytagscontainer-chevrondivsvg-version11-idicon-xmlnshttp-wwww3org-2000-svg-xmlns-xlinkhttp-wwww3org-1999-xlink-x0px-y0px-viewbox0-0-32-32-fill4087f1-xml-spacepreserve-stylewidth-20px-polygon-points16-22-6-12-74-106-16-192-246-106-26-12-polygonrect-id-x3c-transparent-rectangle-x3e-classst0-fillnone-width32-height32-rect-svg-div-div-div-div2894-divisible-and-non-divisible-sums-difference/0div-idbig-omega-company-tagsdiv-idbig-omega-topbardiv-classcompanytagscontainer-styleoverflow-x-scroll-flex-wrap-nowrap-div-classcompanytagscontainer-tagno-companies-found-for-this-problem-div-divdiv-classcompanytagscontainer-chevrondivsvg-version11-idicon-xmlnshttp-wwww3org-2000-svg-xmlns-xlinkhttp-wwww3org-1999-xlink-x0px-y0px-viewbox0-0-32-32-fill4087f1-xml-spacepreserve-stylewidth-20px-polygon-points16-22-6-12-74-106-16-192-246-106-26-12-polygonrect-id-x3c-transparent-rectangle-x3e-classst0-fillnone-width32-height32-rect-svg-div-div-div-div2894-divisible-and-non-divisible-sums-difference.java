class Solution {
    public int differenceOfSums(int n, int m) {
        int nondiv=0;
        
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                nondiv+=i;
            }
        }
        int div=(n*(n+1)/2)-nondiv;
        
        return nondiv-div;
    }
}