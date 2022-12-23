//{ Driver Code Starts
import java.util.*;

class WildcardPattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String pat = sc.nextLine();
			String text = sc.nextLine();
			Solution g = new Solution();
			System.out.println(g.wildCard(pat,text));
			t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int wildCard(String p, String s)
    {
        // Your code goes here
        int n=s.length();
        int m=p.length();
        boolean [][]dp=new boolean[n+1][m+1];
        
        for(int i=n;i>=0;i--){
            for(int j=m;j>=0;j--){
                if(i==n && j==m){
                    dp[i][j]=true;
                }else if(i==n){
                    if(p.charAt(j)=='*'){
                        dp[i][j]=dp[i][j+1];
                    }else{
                        dp[i][j]=false;
                    }
                }else if(j==m){
                    dp[i][j]=false;
                    
                }else{
                    if(p.charAt(j)=='?' || p.charAt(j)==s.charAt(i)){
                        dp[i][j]=dp[i+1][j+1];
                    }else if(p.charAt(j)=='*'){
                        dp[i][j]=dp[i][j+1] || dp[i+1][j];
                    }else{
                        dp[i][j]=false;
                    }
                }
            }
        }
        return dp[0][0]==true?1:0;
    }
}
