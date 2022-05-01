class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String str:words){
            if(s.startsWith(str)){
                count++;
            }
        }
        return count;
                
        
    }
}