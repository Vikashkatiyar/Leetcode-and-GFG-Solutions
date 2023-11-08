class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int freq[] = {1,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0};
        
        int maxVol=0;
        
        int start=0;
        int end=0;
        int currVol=0;
        
        while(end<n){
             currVol+=freq[s.charAt(end)-'a'];
            
             if(end>=k){
                 currVol-=freq[s.charAt(end-k)-'a'];
             }
            
            maxVol=Math.max(currVol, maxVol);
            end++;
        }
        return maxVol;
    }
}