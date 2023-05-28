class Solution {
    //Jai Bhole Baba
    public int[] circularGameLosers(int n, int k) {
        Set<Integer> vis=new HashSet<>();
        vis.add(0);
        
        int curr=0;
        int round=1;
        
        while(true){
            curr=curr+round*k;
            curr=curr%n;
            
            if(vis.contains(curr)){
                break;
            }
            vis.add(curr);
            round++;
        }
        
        int []ans=new int[n-vis.size()];
        int idx=0;
        for(int i=0;i<n;i++){
           if(vis.contains(i)){
               continue;
           } 
            ans[idx++]=i+1;
        }
       return ans; 
    }
}