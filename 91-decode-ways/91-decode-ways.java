class Solution {
    public int numDecodings(String str) {
        int []dp=new int[str.length()+1];
        dp[str.length()]=1;
        
        for(int i=str.length()-1;i>=0;i--){
            
            
            int ch1=str.charAt(i)-'0';
            if(ch1>=1 && ch1<=9){
                dp[i]+=dp[i+1];
            }


            if(i+1<str.length())
            {
                int ch12=(str.charAt(i)-'0')*10+(str.charAt(i+1)-'0');
                if(ch12>=10 && ch12<=26){
                    dp[i]+=dp[i+2];
                }
            }
            
        }
        return dp[0];
    }
}




//recursion way-> gave TLE
// class Solution {
//     public int numDecodings(String s) {
//         return countEncoding(s,0);
//     }
    
//     public int countEncoding(String str,int idx){
//         if(idx==str.length()){
            // return 1;
//         }
        
        
//         int ans=0;
        
//         int ch1=str.charAt(idx)-'0';
//         if(ch1>=1 && ch1<=9){
//             ans+=countEncoding(str,idx+1);
//         }
        
        
//         if(idx+1<str.length()){
//             int ch12=(str.charAt(idx)-'0')*10+(str.charAt(idx+1)-'0');
//             if(ch12>=10 && ch12<=26){
//                 ans+=countEncoding(str,idx+2);
//             }
//         }
//         return ans;
//     }
// }