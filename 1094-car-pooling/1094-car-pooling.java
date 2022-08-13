class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int []map=new int[1001];
        TreeSet<Integer> stops=new TreeSet<>();
        
        for(int [] trip:trips){
            int people=trip[0];
            int from=trip[1];
            int to=trip[2];
            
            map[from]+=people;
            stops.add(from);
            
            
            map[to]-=people;
            stops.add(to);
        }
        
        
        int pic=0;
        for(int stop:stops){
            int delta=map[stop];
            pic+=delta;
            
            if(pic>capacity){
                return false;
            }
        }
        return true;
    }
}