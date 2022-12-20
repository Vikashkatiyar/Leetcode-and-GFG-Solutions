class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        int count=0;
        for(int i=0;i<rooms.get(0).size();i++){
            
            q.add(rooms.get(0).get(i));
        }
        visited[0]=true;
        count++;
        
        while(!q.isEmpty()){
            int key=q.poll();
            if(visited[key]==false){
                visited[key]=true;
                count++;
                for(int i=0;i<rooms.get(key).size();i++){
                    q.add(rooms.get(key).get(i));
                }
            }
        }
        // return count==rooms.size();
        
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                return false;
            }
        }
        return true;
    }
}