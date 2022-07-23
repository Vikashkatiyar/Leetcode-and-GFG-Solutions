class Solution {
    //O(N)
    //o(1)
    public int maxChunksToSorted(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            
            if(max==i){  //max value is equal to right index place
                count++;
            }
        }
        return count;
    }
}