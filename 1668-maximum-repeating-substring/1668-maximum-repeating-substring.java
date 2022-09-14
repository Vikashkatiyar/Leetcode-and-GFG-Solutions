class Solution {
    public int maxRepeating(String sequence, String word) {
        String tbf=word;
        int res=0;
        while(sequence.contains(tbf)){
            tbf+=word;
            res++;
        }
        return res;
    }
}