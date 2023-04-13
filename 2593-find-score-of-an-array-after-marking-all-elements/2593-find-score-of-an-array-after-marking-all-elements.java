class Solution {
    //Jai Bhole
    class Pair implements Comparable<Pair>{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        
        public int compareTo(Pair o){
           if(this.val!=o.val){
               return this.val-o.val;
           }else{
               return this.idx-o.idx;
           }
        }
    }
    public long findScore(int[] nums) {
        int n=nums.length;
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(new Pair(nums[i],i));
        }
        
        boolean[] vis=new boolean[n];
        
        long ans=0;
        while(pq.size()>0){
            Pair rem=pq.remove();
            int remVal=rem.val;
            int remIdx=rem.idx;
            
            if(vis[remIdx]==true){
                continue;
            }
            
            ans+=remVal;
            if(remIdx+1<n){
                vis[remIdx+1]=true;
            }
            
            if(remIdx-1>=0){
                vis[remIdx-1]=true;
            }
            
                
        }
        
        return ans;
    }
}