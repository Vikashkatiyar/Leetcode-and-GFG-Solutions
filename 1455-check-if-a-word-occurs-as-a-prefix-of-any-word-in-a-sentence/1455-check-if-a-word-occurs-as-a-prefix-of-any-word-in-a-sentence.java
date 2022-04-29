class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String []word=sentence.split(" ");
        for(int i=0;i<word.length;i++){
            if(word[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}