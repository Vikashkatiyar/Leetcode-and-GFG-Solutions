class Solution {
    public int addRungs(int[] rungs, int dist) {
    //      int res = (rungs[0] - 1) / dist;
    // for (int i = 1; i < rungs.length; ++i)
    //     res += (rungs[i] - rungs[i - 1] - 1) / dist;
    // return res;
        
        
   //method 2     
        int prev=0;
        int res=0;
        for(int rung:rungs){
            res+=(rung-prev-1)/dist;
            prev=rung;
        }
        return res;
    }
}