class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        //Refer to notes section or Discussion 
        int n=routes.length;
        
        //busStopNo -> busno ArrayList
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        
        for(int i=0;i<routes.length;i++){
            for(int j=0;j<routes[i].length;j++){
                int busStopno=routes[i][j];
                ArrayList<Integer> busno=map.getOrDefault(busStopno,new ArrayList<>());
                busno.add(i);
                map.put(busStopno,busno);
            }
        }
        
        if(!map.containsKey(target)) return -1;
        LinkedList<Integer> q=new LinkedList<>();
        
        //Make visited
        HashSet<Integer> busNoVis=new HashSet<>();
        HashSet<Integer> busStopNoVis=new HashSet<>();
        
        q.addLast(source);
        busStopNoVis.add(source);
        
        //Simple BFS
        int level=0;
        while(q.size()>0){
            int size=q.size();
            
            while(size-->0){
                int rem=q.removeFirst();
                
                if(rem==target){
                    return level;
                }
                
                ArrayList<Integer> temp=map.get(rem);
                for(int tempVal:temp){
                    if(!busNoVis.contains(tempVal)){
                        int[] ba=routes[tempVal];
                        for(int bsn:ba){
                            if(!busStopNoVis.contains(bsn)){
                                q.addLast(bsn);
                                busStopNoVis.add(bsn);
                            }
                            
                        }
                        
                        busNoVis.add(tempVal);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}