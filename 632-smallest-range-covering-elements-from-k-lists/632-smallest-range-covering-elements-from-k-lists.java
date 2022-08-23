class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){ //1.pahle  zero index ki sari value daal doo
            pq.add(new Pair(i,0,nums.get(i).get(0)));
            max=Math.max(max,nums.get(i).get(0));
        }
        
        int rbeg=0;
        int rend=0;
        int rsize=Integer.MAX_VALUE;
        
        while(pq.size()==nums.size()){
            Pair p=pq.remove();
            int csize=max-p.val;
            if(csize<rsize){
                rsize=csize;
                rbeg=p.val;
                rend=max;
            }
            if(p.di<nums.get(p.li).size()-1){
                p.di++;
                p.val=nums.get(p.li).get(p.di);
                pq.add(p);
                
                if(p.val>max){ //dalte hue max update karo
                  max=p.val;
                }
            }
            
        }
        return new int[]{rbeg,rend};
    }
    class Pair implements Comparable<Pair>{
        int li;//listindex
        int di;//dataindex 
        int val;
        Pair(int li,int di,int val){
            this.li=li;
            this.di=di;
            this.val=val;
        }
        public int compareTo(Pair o){
            return this.val-o.val;
        }
    }
}