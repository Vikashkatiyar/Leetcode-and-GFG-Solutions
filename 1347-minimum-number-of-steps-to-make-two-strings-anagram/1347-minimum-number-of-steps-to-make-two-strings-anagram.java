class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        for(char ch:s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        System.out.println(map1);
        
         HashMap<Character,Integer> map2=new HashMap<>();
        for(char ch:t.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        System.out.println(map2);
        int count=0;
        for(Character ch:map2.keySet()){
            if(map1.containsKey(ch)){
                if(map2.get(ch)>map1.get(ch))
                   count+=Math.abs(map1.get(ch)-map2.get(ch));
            }else{
                count+=map2.get(ch);
            }
        }
        return count;
    }
}