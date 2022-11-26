class Solution {
    static int MOD=1000000007;
    public int countPalindromicSubsequences(String str) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        //previous array give the location of middle "a"
        int []prev=new int[str.length()];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           if(map.containsKey(ch)){
               prev[i]=map.get(ch);
           }else{
               prev[i]=-1;
           }
            map.put(ch,i);
        }
        
        map.clear();
        // nextArray give the location of middle "a"
        int []next=new int[str.length()];
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
           if(map.containsKey(ch)==true){
               next[i]=map.get(ch);
           }else{
               next[i]=-1;
           }
            map.put(ch,i);
        }
        
        // main logic
        long [][]dp=new long[str.length()][str.length()];
        
        for(int g=0;g<dp.length;g++){
            for(int i=0,j=g;j<str.length();i++,j++){
                if(g==0){
                    dp[i][j]=1;
                }
                else if(g==1){
                    dp[i][j]=2;
                }
                else{
                    char sc=str.charAt(i);
                    char ec=str.charAt(j);
                    
                    if(sc!=ec){
                        dp[i][j]=(dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1]+MOD)%MOD;
                    }else{
                        int n=next[i];
                        int p=prev[j];
                        if(n>p){
                            dp[i][j]=(2*dp[i+1][j-1]+2)%MOD;
                        }
                        else if(n==p){
                            dp[i][j]=(2*dp[i+1][j-1]+1)%MOD;
                        }else{
                            dp[i][j]=(2*dp[i+1][j-1]-dp[n+1][p-1]+MOD)%MOD;
                        }
                        
                    }
                }
            }
        }
        
        return (int)dp[0][str.length()-1];
        
    }
}