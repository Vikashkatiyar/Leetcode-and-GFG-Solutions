class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean []freq=new boolean[26];
        for(char arr:sentence.toCharArray()){
            freq[arr-'a']=true;
        }
        for(boolean existLetter : freq) {
            if(!existLetter) return false;
        }
        
        return true;
    }
}