class Solution {
    public int maxCoins(int[] piles) {
        int maxCoin=0;
        Arrays.sort(piles);
        int i=0;
        int j=piles.length-2;
        while(i++<piles.length/3){
          maxCoin+=piles[j];
          j-=2;
        }
        return maxCoin;
    }
}