class Solution {
    public String lastNonEmptyString(String s) {
        int[] freq=new int[26];
        int maxCount=0;
        
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
            maxCount=Math.max(maxCount, freq[ch-'a']);
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(maxCount==freq[ch-'a']){
                sb.append(ch);
                freq[ch-'a']=0;
            }
        }
        
        return sb.reverse().toString();
    }
}