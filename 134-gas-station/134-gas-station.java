class Solution {
    //O(n)
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int csum=0;
        int osum=0;
        int si=0;
        for(int i=0;i<gas.length;i++){
            csum+=(gas[i]-cost[i]);
            osum+=(gas[i]-cost[i]);
            
            if(csum<0){
                csum=0;
                si=i+1;
            }
        }
        
        if(osum>=0){
            return si;
        }else{
            return -1;
        }
    }
}