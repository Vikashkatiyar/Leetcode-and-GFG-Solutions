class Solution {
    public int countSetBitsHelper(int n){
        int count=0;
        while(n!=0){
            int rsb=n&-n;
            n=n-rsb;
            count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        ans[0]=0;
        
        for(int i=1;i<=n;i++){
            ans[i]=countSetBitsHelper(i);
        }
        return ans;
    }
}