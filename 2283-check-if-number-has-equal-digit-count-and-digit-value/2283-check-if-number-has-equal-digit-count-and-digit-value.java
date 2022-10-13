class Solution {
    public boolean digitCount(String num) {
        int[] freq = new int[10];
        for(char c : num.toCharArray()){
            freq[c-'0']++;
        }
        for(int i = 0; i<num.length(); i++){
            if(num.charAt(i)-'0' != freq[i]) return false;
        }
        return true;
    }
}