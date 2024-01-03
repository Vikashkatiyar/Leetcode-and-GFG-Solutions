class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        int n=access_times.size();
        
        Map<String, List<Integer>> map=new HashMap<>();
        for(List<String> acc: access_times){
            String key=acc.get(0);
            int value=Integer.valueOf(acc.get(1));
            
            map.computeIfAbsent(key, v-> new ArrayList<>()).add(value);
        }
        
        
        List<String> ans = new ArrayList<>();
        for(String employee: map.keySet()){
            List<Integer> times=map.get(employee);
            if(times.size()<3){
                continue;
            }
            Collections.sort(times);
            
            for(int i=0;i<times.size()-2;i++){
                if(times.get(i)+100 > times.get(i+2)){
                    ans.add(employee);
                    break;
                }
            }
        }
        
        return ans;
    }
}