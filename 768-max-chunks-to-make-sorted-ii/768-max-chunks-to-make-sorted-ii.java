class Solution {
    //O(n)
    //O(n)
    //chainnig method 
    
    public int maxChunksToSorted(int[] arr) {
        //1. Make rightminimum array
         int [] rmin=new int[arr.length+1];
        rmin[rmin.length-1]=Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            rmin[i]=Math.min(arr[i],rmin[i+1]);
        }
        
        //2.Make leftMax Array then compare where lmax<=rmin[i+1]
        
        int lmax=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++){
            lmax=Math.max(lmax,arr[i]);
            if(lmax<=rmin[i+1]){
                count++;
            }
        }
        return count;
    }
}