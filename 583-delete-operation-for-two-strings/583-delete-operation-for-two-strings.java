// If there are no letters common, then deletions required = m + n, where m and n are sizes of the words
// If there are some letters common, then deletions required = m + n - 2 * size(longest common subsequence). This is because we'll have to delete LCS from both the words to make them equal

class Solution {
    public int minDistance(String word1, String word2) {
        return word1.length()+word2.length()-2*longestCommonSubsequence(word1,word2);
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        
        int[][] dp=new int[m+1][n+1];
    
        
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        return dp[m][n];
    }
}