class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int res=0;
        int maxLen=0;
        for(int[] r:rectangles){
           int val=Math.min(r[0],r[1]);
            if(maxLen<val){
                maxLen=val;
                res=1;
            }
            else if(maxLen==val){
                res++;
            }
        }
        return res;
    }
}