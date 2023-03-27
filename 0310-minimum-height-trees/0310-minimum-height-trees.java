class Solution {
    //Jai Bhole
    //O(1)
    //O(1)
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res=new ArrayList<>();
        
        if(n<=0){
            return res;
        }
        if(n==1){
            res.add(0);
            return res;
        }
        
        List<List<Integer>> adList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adList.add(new ArrayList<>());
        }
        
        int[] inDegree=new int[n];
        
        for(int[] e:edges){
            inDegree[e[0]]++;
            inDegree[e[1]]++;
            
            adList.get(e[0]).add(e[1]);
            adList.get(e[1]).add(e[0]);
        }
        
        LinkedList<Integer> q=new LinkedList();
        for(int i=0;i<n;i++){
            if(inDegree[i]==1){
                q.addLast(i);
            }
        }
        while(n>2){
            int size=q.size();
            n-=size;
            while(size-->0){
                int rem=q.removeFirst();
                
                for(int nbr:adList.get(rem)){
                    inDegree[nbr]--;
                    
                    if(inDegree[nbr]==1){
                        q.addLast(nbr);
                    }
                }
            }
        }
        
        res.addAll(q);
        return res;
    }
}