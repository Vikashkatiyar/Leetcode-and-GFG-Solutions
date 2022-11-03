class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ways=0;
        long pensCost=0;
        while(pensCost<=total){
            long remCost=total-pensCost;
            long pencils=remCost/cost2;
            ways+=pencils+1;
            pensCost+=cost1;
        }
        return ways;
    }
}