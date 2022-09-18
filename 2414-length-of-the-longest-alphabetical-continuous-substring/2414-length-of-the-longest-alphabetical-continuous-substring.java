class Solution {
    public int longestContinuousSubstring(String s) {
        int start=0;
        int i=0;
        int len=s.length();
        int maxLen=0;
        while(i<len){
            while((i+1<len) && ((int)(s.charAt(i))+1==(int)(s.charAt(i+1)))){
                i++;
            }
            int currLen=i-start+1;
            maxLen=Math.max(currLen,maxLen);
            i++;
            start=i;
        }
        return maxLen;
    }
}