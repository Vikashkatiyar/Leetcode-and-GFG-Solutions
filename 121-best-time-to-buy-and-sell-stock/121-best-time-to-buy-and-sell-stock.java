class Solution {
    public int maxProfit(int[] cost) {
        int minDay=cost[0];
        int maxProfit=0;

        for(int i=1;i<cost.length;i++){
            int currProfit=cost[i]-minDay;

            if(currProfit>maxProfit){
                maxProfit=currProfit;
            }


            if(cost[i]<minDay){
                minDay=cost[i];
            }
        }
        return maxProfit;
    }
}