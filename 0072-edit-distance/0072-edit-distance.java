class Solution {
    public int minDistance(String word1, String word2) {
        final int n=word1.length();
        final int m=word2.length();
        
        int[][] dp=new int[n+1][m+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0){
                    dp[i][j]=j;
                }else if(j==0){
                    dp[i][j]=i;
                }else{
                    if(word1.charAt(i-1) == word2.charAt(j-1)){
                        dp[i][j]=dp[i-1][j-1];
                    }else{
                        int replace=1+dp[i-1][j-1] ;
                        int delete=1+dp[i-1][j];
                        int insert=1+dp[i][j-1];
                        
                        dp[i][j]=Math.min(replace,Math.min(delete,insert));
                    }
                }
            }
        }
        
        return dp[n][m];
    }
}