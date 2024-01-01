class Solution {
    
    //Jai Bhole
    public int longestMountain(int[] arr) {
        
        int maxCount=0;
        
        int up=0, down=0, i=1;
        
        while(i<arr.length){
            while(i<arr.length && arr[i-1]==arr[i]){
                i++;
            }
            up=0;
            while(i<arr.length && arr[i-1]<arr[i]){
                up++;
                i++;
            }
            
            down=0;
            while(i<arr.length && arr[i-1]>arr[i]){
                down++;
                i++;
            }
            
            if(up>0 && down>0){
                maxCount=Math.max(maxCount, up+down+1);
            }
        }
        
        return maxCount;
    }
}