class Solution {
    public int numberOfSubstrings(String s) {
        int []freq=new int[3]; //for a,b,c
        
        int se=0;
        int ed=0;
        int ans=0;
        
        while(ed<s.length()){
            freq[s.charAt(ed)-'a']++;
            
            while(freq[0]>0 &&freq[1]>0 && freq[2]>0){
                ans+=(s.length()-ed);
                freq[s.charAt(se++)-'a']--;
            }
            ed++;
        }
        return ans;
    }
}