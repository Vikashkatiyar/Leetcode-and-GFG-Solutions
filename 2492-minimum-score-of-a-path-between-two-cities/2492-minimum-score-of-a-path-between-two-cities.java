class Solution {
    //Jai Mata Di
      class Pair{
          int node;
          int dis;
          Pair(int node,int dis){
              this.node=node;
              this.dis=dis;
          }
      }
    public int minScore(int n, int[][] roads) {
        
        //make graph of adjList
        List<List<Pair>> gList=buildGraph(n,roads);
        
        //Simple BFS
        LinkedList<Pair> q=new LinkedList<>();
        boolean[] vis=new boolean[n+1]; //n+1 becoz we start with 1 not 0,0th location is useLess for me 
        
        q.addLast(new Pair(1,Integer.MAX_VALUE));
        int ans=Integer.MAX_VALUE;
        
        
        while(q.size()>0){
            //remove
            Pair rem=q.removeFirst();
            
            //marks
            vis[rem.node]=true;
            
            //work
            ans=Math.min(ans,rem.dis);
            
            //add nbr
            for(Pair nbr:gList.get(rem.node)){
                if(vis[nbr.node]==false){
                    q.add(nbr);
                }
            }
            
            
        }
        
        return ans;
    }
    
    public List<List<Pair>> buildGraph(int n,int[][] roads){
        
        List<List<Pair>> gList=new ArrayList<>();
        
        //n+1 becoz we start with 1 not 0,0th location is useLess for me 
        for(int i=0;i<n+1;i++){
            gList.add(new ArrayList<>());
        }
        
        for(int i=0;i<roads.length;i++){
            int r1=roads[i][0];
            int r2=roads[i][1];
            int d=roads[i][2];
            
            gList.get(r1).add(new Pair(r2,d));
            gList.get(r2).add(new Pair(r1,d));
        }
        
        return gList;
    }
}