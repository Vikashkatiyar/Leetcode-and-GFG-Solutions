class Solution {
     
    HashMap<Integer, Integer> map;
    Random rand;
    int row, col, totalZeros;
    public Solution(int m, int n) {
        row=m;
        col=n;
        totalZeros=row*col;
        map=new HashMap<>();
        rand=new Random();
    }
    
    public int[] flip() {
        int randIndex=rand.nextInt(totalZeros--);
        int originalIndex=map.getOrDefault(randIndex, randIndex);
        
        map.put(randIndex, map.getOrDefault(totalZeros, totalZeros));
        
        return new int[]{originalIndex/col, originalIndex%col};
    }
    
    public void reset() {
        map.clear();
        totalZeros=row*col;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */