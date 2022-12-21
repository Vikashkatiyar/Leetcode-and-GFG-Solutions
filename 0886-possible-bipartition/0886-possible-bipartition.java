class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        int[] colour=new int[N+1];
        List<Integer>[] graph=new List[N+1];
        for(int i=0;i<=N;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int[] v:dislikes){
            graph[v[0]].add(v[1]);
            graph[v[1]].add(v[0]);
        }
        
        
        //main logic
        for(int i=1;i<=N;i++)
        {
                if(colour[i]==0){
                            LinkedList<Integer> q=new LinkedList<>();
                            q.add(i);
                            colour[i]=1;
                            while(q.size()!=0){
                                int top=q.removeFirst();
                                for(int nbr:graph[top]){
                                    if(colour[nbr]==colour[top]){
                                        return false;
                                    }
                                    if(colour[nbr]==0){
                                        colour[nbr]=-colour[top];
                                        q.add(nbr);
                                    }
                                }
                            }
                }
        }
        return true;
    }
}