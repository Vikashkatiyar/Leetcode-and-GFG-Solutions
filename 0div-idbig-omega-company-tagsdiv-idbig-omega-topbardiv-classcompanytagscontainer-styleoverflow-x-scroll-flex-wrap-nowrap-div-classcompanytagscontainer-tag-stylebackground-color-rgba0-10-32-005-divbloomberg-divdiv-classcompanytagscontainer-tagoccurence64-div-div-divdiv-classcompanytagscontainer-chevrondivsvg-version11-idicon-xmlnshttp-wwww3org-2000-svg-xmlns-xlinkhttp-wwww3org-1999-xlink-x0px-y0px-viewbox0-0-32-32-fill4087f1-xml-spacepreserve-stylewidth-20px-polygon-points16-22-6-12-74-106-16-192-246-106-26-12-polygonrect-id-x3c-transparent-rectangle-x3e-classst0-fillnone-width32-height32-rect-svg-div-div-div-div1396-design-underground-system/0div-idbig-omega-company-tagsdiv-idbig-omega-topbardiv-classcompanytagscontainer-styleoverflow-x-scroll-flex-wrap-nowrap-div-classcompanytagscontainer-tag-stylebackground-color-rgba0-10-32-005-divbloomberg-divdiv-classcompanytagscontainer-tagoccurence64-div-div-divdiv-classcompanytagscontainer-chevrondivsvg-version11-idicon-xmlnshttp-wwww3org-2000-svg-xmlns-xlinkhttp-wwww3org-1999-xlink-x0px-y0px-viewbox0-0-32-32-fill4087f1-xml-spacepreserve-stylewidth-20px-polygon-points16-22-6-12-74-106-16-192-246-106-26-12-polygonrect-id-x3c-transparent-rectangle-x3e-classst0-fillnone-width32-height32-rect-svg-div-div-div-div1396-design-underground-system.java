class UndergroundSystem {
    //Jai Shree Ram
    Map<Integer, Pair<String, Integer>> checkInMap;
    Map<String , Pair<Integer, Integer>> routeMap;
    public UndergroundSystem() {
        checkInMap=new HashMap<>();
        routeMap=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id,new Pair<>(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> entry=checkInMap.get(id);
        checkInMap.remove(id);
        
        String entryStation=entry.getKey();
        int Time=t-entry.getValue();
        
        String route=entryStation+"-"+stationName;
        
        Pair<Integer, Integer> rPair=routeMap.getOrDefault(route,new Pair(0,0));
        routeMap.put(route,new Pair(rPair.getKey()+Time, rPair.getValue()+1));
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String route=startStation+"-"+endStation;
        Pair<Integer, Integer> avg = routeMap.get(route);
        
        return (double)avg.getKey()/avg.getValue();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */