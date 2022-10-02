class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        for(char ch:s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char c:t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        int count=0;
        for(Character ch:map2.keySet()){
            if(map1.containsKey(ch)){
                count+=Math.abs(map1.get(ch)-map2.get(ch));
                map1.remove(ch);
            }else{
                count+=map2.get(ch);
            }
        }
        
        for(Character ch:map1.keySet()){
            count+=map1.get(ch);
        }
        return count;
    }
}