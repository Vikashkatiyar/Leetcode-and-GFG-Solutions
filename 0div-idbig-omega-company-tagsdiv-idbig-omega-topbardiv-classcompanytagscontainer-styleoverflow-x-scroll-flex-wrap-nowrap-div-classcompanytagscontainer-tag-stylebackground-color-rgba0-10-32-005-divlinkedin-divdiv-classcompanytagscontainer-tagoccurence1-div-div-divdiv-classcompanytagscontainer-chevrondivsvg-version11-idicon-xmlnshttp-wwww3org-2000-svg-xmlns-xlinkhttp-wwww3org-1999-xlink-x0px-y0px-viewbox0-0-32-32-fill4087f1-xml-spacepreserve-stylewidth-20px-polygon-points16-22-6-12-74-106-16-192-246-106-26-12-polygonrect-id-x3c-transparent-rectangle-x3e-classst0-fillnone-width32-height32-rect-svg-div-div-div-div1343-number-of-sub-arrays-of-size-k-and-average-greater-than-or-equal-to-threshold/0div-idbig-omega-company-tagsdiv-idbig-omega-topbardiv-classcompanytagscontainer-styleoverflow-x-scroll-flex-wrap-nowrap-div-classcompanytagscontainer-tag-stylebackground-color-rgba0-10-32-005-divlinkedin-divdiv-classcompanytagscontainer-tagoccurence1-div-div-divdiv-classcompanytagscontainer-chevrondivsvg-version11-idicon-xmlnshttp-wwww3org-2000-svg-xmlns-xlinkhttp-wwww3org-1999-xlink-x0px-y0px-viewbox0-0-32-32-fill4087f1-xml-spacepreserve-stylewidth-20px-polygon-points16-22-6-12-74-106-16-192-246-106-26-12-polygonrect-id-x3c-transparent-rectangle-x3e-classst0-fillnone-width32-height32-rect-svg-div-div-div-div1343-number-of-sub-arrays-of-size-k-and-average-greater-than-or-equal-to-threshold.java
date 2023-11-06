class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int ans=0;
        if(arr.length<k){
            return ans;
        }
        
        int avg=sum/k;
        if(avg>=threshold){
           ans++; 
        }
        
        for(int i=k;i<arr.length;i++){
            //remove old element
            sum-=arr[i-k];
            
            //add new element
            sum+=arr[i];
            avg=sum/k;
            if(avg>=threshold){
                ans++; 
            }
        }
        
        return ans;
    }
}