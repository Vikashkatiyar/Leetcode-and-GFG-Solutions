class Solution {
    public int maxProfit(int[] cost) {
        int n=cost.length;
        int []left=new int[n];
        int []right=new int[n];

//Aaj yaa aaj se pahle bechaa ho
        int buyingDay=cost[0];
        for(int i=1;i<n;i++){
            int currProfit=cost[i]-buyingDay;
            currProfit=Math.max(currProfit,left[i-1]);
            left[i]=currProfit;
            buyingDay=Math.min(buyingDay,cost[i]);
        }


//Aaj yaa aaj se pahle kharida hoo
        int sellingDay=cost[n-1];
        for(int i=n-2;i>0;i--){
            int currProfit=sellingDay-cost[i];
            currProfit=Math.max(currProfit,right[i+1]);
            right[i]=currProfit;

            sellingDay=Math.max(sellingDay,cost[i]);
        }


        int maxProfit=0;
        for(int i=0;i<n;i++){
            maxProfit=Math.max(maxProfit,left[i]+right[i]);
        }
        return maxProfit;
    }
}