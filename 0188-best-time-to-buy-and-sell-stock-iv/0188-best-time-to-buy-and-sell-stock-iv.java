class Solution {
    public int maxProfit(int k, int[] arr) {
        int n=arr.length;
        int[][] dp=new int[k+1][n];
        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         dp[i][j]=0;
        //     }
        // }
        //row-> transaction
        //col-> days
        
        for(int t=1;t<=k;t++){
            for(int d=1;d<n;d++){
                int max=dp[t][d-1]; //ek din pahle all transn done
                
                for(int pd=0;pd<d;pd++){ // ek transaction left banki sab pahle ho gaye 
                    int pastDayDoneTransn=dp[t-1][pd];
                    int OneleftOutTansn=arr[d]-arr[pd];
                    
                    if(pastDayDoneTransn+OneleftOutTansn>max){
                        max=OneleftOutTansn+pastDayDoneTransn;
                    }
                }
                
                dp[t][d]=max;
            }
        }
        
         return dp[dp.length-1][dp[0].length-1];
       // return dp[k][n-1];
        
        // int max=0;
        // for(int i=1;i<dp.length;i++){
        //     for(int j=1;j<dp[0].length;j++){
        //         max=Math.max(max,dp[i][j]);
        //     }
        // }
        // return max;
    }
}