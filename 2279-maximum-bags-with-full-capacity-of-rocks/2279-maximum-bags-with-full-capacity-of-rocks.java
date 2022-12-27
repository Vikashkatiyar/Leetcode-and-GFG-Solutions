class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        for(int i=0;i<rocks.length;i++){
            capacity[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(capacity);
        
        int count=0;
        int i=0;
        while(i<capacity.length && additionalRocks>=capacity[i]){
            additionalRocks-=capacity[i];
            count++;
            i++;
        }
        return count;
    }
}