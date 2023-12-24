class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n=arr.length;
        
        int s=0,e=n-1;
        
        while(s < n-1 && arr[s] <= arr[s+1]){
            s++;
        }
        if(s==n-1){  //ascending array
            return 0;
        }
        
        while( e>=s && arr[e] >= arr[e-1]){
            e--;
        }
        
        int minLen=Math.min(n-s-1, e);
        
        int i=0,j=e;
        while(i<=s && j<n){
            if(arr[i]<=arr[j]){
                minLen=Math.min(minLen, j-i-1);
                i++;
            }else{
                j++;
            }
        }
        
        return minLen;
    }
}