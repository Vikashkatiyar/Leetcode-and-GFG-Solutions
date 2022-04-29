class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int res = 0; 
        for(int i = 0; i<words.length; i++){
            if(words[i].startsWith(pref)){
                //startsWith()method applicable on String in java
               res++; 
            }
        }
        return res; 
    }
}