class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String []a=s1.split(" ");
        String []b=s2.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:a){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:b){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        ArrayList<String> list=new ArrayList<>();
        for(String s:map.keySet()){
            if(map.get(s)==1){
                list.add(s);
            }
        }
        String[] res = new String[list.size()];
        int idx = 0;
        for(String s:list){
            res[idx++] = s;
        }
        return res;
    }
}