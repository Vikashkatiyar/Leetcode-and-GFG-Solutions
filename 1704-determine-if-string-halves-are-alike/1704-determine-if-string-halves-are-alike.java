class Solution {
    String vowel="aeiouAEIOU";
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        int ans=0;
        for(int i=0,j=mid;i<mid;i++,j++){
            if(vowel.indexOf(s.charAt(i))>=0){
                ans++;
            }
            if(vowel.indexOf(s.charAt(j))>=0){
                ans--;
            }
        }
        return ans==0;
    }
}