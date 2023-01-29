class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int ans=Integer.MAX_VALUE;
        int n=words.length;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
            int dist=Math.abs(i-startIndex);
            ans=Math.min(ans,dist);//forword distance
            ans=Math.min(ans,n-dist); //backword distance

            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
