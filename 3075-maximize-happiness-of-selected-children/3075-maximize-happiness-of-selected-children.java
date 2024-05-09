class Solution {
    //Jai Bhole
    public long maximumHappinessSum(int[] happ, int k) {
        long ans = 0; 
        Arrays.sort(happ);        
         
        int count = 0;
        for(int i = happ.length -1;i>=0;i--){    
            ans+=Math.max(0, happ[i]-count);
            count++;            
            if(count>=k)
                break;    
        }
                
        return ans;
    }
}