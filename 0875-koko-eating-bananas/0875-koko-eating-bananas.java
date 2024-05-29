class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxBananas(piles);
        
        while(low<high){
            int mid=low+(high-low)/2;
            if(blackbox(mid,piles,h)){
                high=mid;
            }
            else
                low=mid+1;
        }
        return low;
    }
    public boolean blackbox(int maxpiles,int[] piles,int h){
        int hours=0;
        for(int i:piles){
            int time=i/maxpiles;
            hours+=time;
            if(i%maxpiles!=0) hours++;
        }
        if(hours<=h)
            return true;
        return false;
    }
    public int maxBananas (int[] piles){
        int maxBananas = 0;
        for(int i=0;i<piles.length;i++){
            maxBananas=Math.max(maxBananas,piles[i]);
        }
        return maxBananas;
    }
}