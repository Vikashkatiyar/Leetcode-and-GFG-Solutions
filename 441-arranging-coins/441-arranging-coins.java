class Solution {
    public int arrangeCoins(int n) {
        int rowcount=0;
        while(n>0){
            rowcount++;
            n=n-rowcount;
        }
        return n==0?rowcount:rowcount-1;
    }
}