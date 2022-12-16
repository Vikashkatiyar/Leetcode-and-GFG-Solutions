class Solution {
    public int nthUglyNumber(int n) {
        int []dp=new int[n+1];
        
        int io2=1;
        int io3=1;
        int io5=1;
        dp[1]=1;
        
        for(int i=2;i<dp.length;i++){
            int mo2=2*dp[io2];
            int mo3=3*dp[io3];
            int mo5=5*dp[io5];
            
            int min=Math.min(mo2,Math.min(mo3,mo5));
            if(min==mo2){
               io2++;
            }
            if(min==mo3){
                io3++;
            }
            if(min==mo5){
               io5++;  
            }
            dp[i]=min;
        }
        return dp[n];
    }
}