class Solution {
    public int[] getAverages(int[] arr, int k) {
        int n=arr.length;
        int[] ans=new int[n];
        if(k==0){
            
        }
        
        if(n<2*k+1){
            Arrays.fill(ans,-1);
            return ans;
        }
        
        long sum=0;
        for(int i=0;i<2*k+1;i++){
            sum+=arr[i];
            if(i<k)
               ans[i]=-1;
        }
        int avg=(int)(sum/(2*k+1))%1000000000;
        for(int i=k;i<n;i++){
            if(i-k>=0 && i+k<n){
                ans[i]=avg;
            }else{
                ans[i]=-1;
            }
             
            
            if(i+k+1<n){
                sum-=arr[i-k];
                sum+=arr[i+k+1];
                avg=(int)(sum/(2*k+1))%1000000000;    
            }
            
        }
        return ans;
        
    }
}