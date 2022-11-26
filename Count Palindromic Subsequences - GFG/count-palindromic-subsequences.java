//{ Driver Code Starts
import java.util.*;
class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			//System.out.println(str.length());
			Solution ob  = new Solution();
			System.out.println(ob.countPS(str));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete below method */

class Solution
{
    static int MOD=1000000007;
    long countPS(String str)
    {
       long[][] dp=new long[str.length()][str.length()];
       
       for(int g=0;g<dp.length;g++){
           for(int i=0,j=g;j<dp[0].length;i++,j++){
               if(g==0){
                   dp[i][j]=1;
               }
               else if(g==1){
                   dp[i][j]=(str.charAt(i)==str.charAt(j))?3:2;
               }
               else{
                   char sc=str.charAt(i);
                   char ec=str.charAt(j);
                   if(sc==ec){
                       dp[i][j]=(dp[i+1][j]+dp[i][j-1]+1)%MOD;
                   }else{
                       dp[i][j]=(dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1])%MOD;
                   }
               }
           }
       }
       return (MOD+dp[0][str.length()-1])%MOD;
    }
}