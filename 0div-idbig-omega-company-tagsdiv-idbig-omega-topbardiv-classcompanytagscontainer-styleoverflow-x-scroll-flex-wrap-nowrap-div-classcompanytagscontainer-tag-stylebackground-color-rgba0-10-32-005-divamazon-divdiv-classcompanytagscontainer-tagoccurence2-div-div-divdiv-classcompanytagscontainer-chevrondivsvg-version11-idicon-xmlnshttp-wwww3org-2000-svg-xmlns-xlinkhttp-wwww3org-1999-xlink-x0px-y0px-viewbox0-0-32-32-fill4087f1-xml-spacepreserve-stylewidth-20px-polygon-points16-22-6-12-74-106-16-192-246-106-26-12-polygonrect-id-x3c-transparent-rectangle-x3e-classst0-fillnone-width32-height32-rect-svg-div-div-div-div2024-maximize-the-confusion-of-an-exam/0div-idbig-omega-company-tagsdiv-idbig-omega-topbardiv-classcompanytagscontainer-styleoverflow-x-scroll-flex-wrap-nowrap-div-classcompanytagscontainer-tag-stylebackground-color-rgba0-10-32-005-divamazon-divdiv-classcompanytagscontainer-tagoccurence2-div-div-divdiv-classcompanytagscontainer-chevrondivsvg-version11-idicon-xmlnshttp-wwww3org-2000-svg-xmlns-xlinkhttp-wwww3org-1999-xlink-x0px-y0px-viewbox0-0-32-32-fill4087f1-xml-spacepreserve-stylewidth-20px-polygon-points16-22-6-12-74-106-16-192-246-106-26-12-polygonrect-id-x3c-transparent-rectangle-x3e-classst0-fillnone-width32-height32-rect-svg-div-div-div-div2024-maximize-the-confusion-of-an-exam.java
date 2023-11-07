class Solution {
    //sliding window
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(helper(answerKey,k,'T'), helper(answerKey,k,'F'));
    }
    public int helper(String s, int k, char ch){
        int sp=0;
        int ep=0;
        
        int ans=0;
        while(ep<s.length()){
            char currCh=s.charAt(ep);
            if(currCh!=ch){
                k--;
            }
            
            while(k<0){
                if(s.charAt(sp)==ch){
                    sp++;
                }else{
                    sp++;
                    k++;
                }
            }
            ans=Math.max(ans, ep-sp+1);
            ep++;
        }
        return ans;
    }
}