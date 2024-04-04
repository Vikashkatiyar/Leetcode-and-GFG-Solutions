class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int count=0;
        
        for(char ch: s.toCharArray()){
            if(ch=='('){
                count++;
                ans=Math.max(ans, count);
            }else if(ch==')'){
                count--;
            }
        }
        
        return ans;
    }
}