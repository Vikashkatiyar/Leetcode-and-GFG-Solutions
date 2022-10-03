class Solution {
    //two pointer approach
    public int minCost(String colors, int[] time) {
        int start=0;
        int end=0;
        int totaltime=0;
        int n=colors.length();
        while(start<n && end<n){
            int maxTime=0;
            int sameColTime=0;
            //Basically remove the minimum time slot color so
            // tatalTime-maxTimeUsedByColor
            while(end<n && colors.charAt(start)==colors.charAt(end)){
                maxTime=Math.max(maxTime,time[end]);
                sameColTime+=time[end];
                end++;
            }
            totaltime+=sameColTime-maxTime;
            start=end;
        }
        return totaltime;
    }
}