class Solution {
    public boolean isMatch(String s, String p) {
        boolean [][]dp=new boolean[s.length()+1][p.length()+1];
        int n=s.length();
        int m=p.length();
        
        
        for(int i=n;i>=0;i--){
            for(int j=m;j>=0;j--){
                if(i==n && j==m){
                        dp[i][j]=true;
                }
                else if(i==n)
                { //last row
                        if(p.charAt(j)=='*'){
                            dp[i][j]=dp[i][j+1];
                        }else{
                            dp[i][j]=false;
                        }
                }
                else if(j==m)
                { //last coloum always false becoz pattrn ends
                        dp[i][j]=false;
                }
                else
                {
                        if(p.charAt(j)=='?' || p.charAt(j)==s.charAt(i)){
                            dp[i][j]=dp[i+1][j+1];
                        }else if(p.charAt(j)=='*'){
                            dp[i][j]=dp[i][j+1]||dp[i+1][j];
                        }else{
                            dp[i][j]=false;
                        }
                }
            }
        }
        return dp[0][0];
    }
}