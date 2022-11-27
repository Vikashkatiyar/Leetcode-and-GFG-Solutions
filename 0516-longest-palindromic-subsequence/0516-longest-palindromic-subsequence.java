class Solution {
    public int longestPalindromeSubseq(String s) {
        int [][]dp=new int[s.length()][s.length()];
        
        for(int g=0;g<dp.length;g++){
            for(int i=0,j=g;j<dp[0].length;i++,j++){
                if(g==0){
                    dp[i][j]=1;
                }
                else if(g==1){
                    dp[i][j]=(s.charAt(i)==s.charAt(j))?2:1;
                }else{
                    char sc=s.charAt(i);
                    char ec=s.charAt(j);
                    if(sc!=ec){
                        dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
                    }else{
                        dp[i][j]=2+dp[i+1][j-1];
                    }
                }
            }
        }
        return dp[0][dp[0].length-1];
    }
}