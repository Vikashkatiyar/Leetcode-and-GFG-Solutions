class Solution {
    //O(n)
    //O(n)
    public int maxChunksToSorted(int[] arr) {
        
        //make a min array fill from the right side
        int []minfr=new int[arr.length];
        minfr[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            minfr[i]=Math.min(arr[i],minfr[i+1]);
        }
        
        
        //find max and check max from left <=minimum from right +1 from minfr
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            max=Math.max(arr[i],max);
            
            if(max<=minfr[i+1]){
                count++;
            }
        }
        return count+1;//  if barrier two then partition is 4
    }
}