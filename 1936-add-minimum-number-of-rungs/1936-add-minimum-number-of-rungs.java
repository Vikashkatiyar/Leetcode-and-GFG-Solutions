class Solution {
    public int addRungs(int[] rungs, int dist) {
         int res = (rungs[0] - 1) / dist;
        // int res=0;
    for (int i = 1; i < rungs.length; ++i)
        res += (rungs[i] - rungs[i - 1] - 1) / dist;
    return res;
    }
}