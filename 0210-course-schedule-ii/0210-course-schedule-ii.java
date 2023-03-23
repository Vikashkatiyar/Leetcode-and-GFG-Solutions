class Solution {
    public int[] findOrder(int num, int[][] preq) {
        
        
        List<List<Integer>> gdList=new ArrayList<>();
        for(int i=0;i<num;i++){
            gdList.add(new ArrayList<>());
        }
        
        for(int i=0;i<preq.length;i++){
            gdList.get(preq[i][1]).add(preq[i][0]);
        }
        
        //Make inDegree Array
        int[] inDegree=new int[num];
        
        for(int i=0;i<num;i++){
            for(int nbr:gdList.get(i)){
                inDegree[nbr]++;
            }
        }
        
        int[] ans=new int[num];
        LinkedList<Integer> q=new LinkedList<>();
        
        for(int i=0;i<num;i++){
            if(inDegree[i]==0){
                q.addLast(i);
            }
        }
        
        int idx=0;
        while(q.size()>0){
            int rem=q.removeFirst();
            
            ans[idx++]=rem;
            
            for(int nbr:gdList.get(rem)){
                inDegree[nbr]--;
                
                if(inDegree[nbr]==0){
                    q.addLast(nbr);
                }
            }
        }
        
        if(idx==num){
            return ans;
        }else{
            return new int[]{};
        }
    }
}