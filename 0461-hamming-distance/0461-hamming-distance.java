class Solution {
    //Jai Baba Bhole
    public int hammingDistance(int x, int y) {
        int XOR=x^y;
        return Integer.bitCount(XOR);
    }
}