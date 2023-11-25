class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        //Jai Shree Ram
        int[] res=new int[k];
        
        HashMap<Integer, Set<Integer>> map=new HashMap<>();
        
        for(int []log: logs){
            Set<Integer> set=map.getOrDefault(log[0],new HashSet<>());
            set.add(log[1]);
            map.put(log[0],set);
        }
        
        for(Set<Integer> set: map.values()){
            res[set.size()-1]++;
        }
        return res;
    }
}