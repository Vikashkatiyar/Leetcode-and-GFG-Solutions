class TimeMap {
    HashMap<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            map.get(key).put(timestamp,value);
        }else{
           TreeMap<Integer,String> temp=new TreeMap<>();
            temp.put(timestamp,value);
             map.put(key,temp);
        }
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            if(map.get(key).containsKey(timestamp)){ 
                // timestamp is present 
                return map.get(key).get(timestamp);
                
            }else{
                // timestamp not present
                Integer PrevTimeStamp=map.get(key).floorKey(timestamp);//insted of this we do here linear search
                if(PrevTimeStamp!=null){
                    return map.get(key).get(PrevTimeStamp);
                }
            }
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */