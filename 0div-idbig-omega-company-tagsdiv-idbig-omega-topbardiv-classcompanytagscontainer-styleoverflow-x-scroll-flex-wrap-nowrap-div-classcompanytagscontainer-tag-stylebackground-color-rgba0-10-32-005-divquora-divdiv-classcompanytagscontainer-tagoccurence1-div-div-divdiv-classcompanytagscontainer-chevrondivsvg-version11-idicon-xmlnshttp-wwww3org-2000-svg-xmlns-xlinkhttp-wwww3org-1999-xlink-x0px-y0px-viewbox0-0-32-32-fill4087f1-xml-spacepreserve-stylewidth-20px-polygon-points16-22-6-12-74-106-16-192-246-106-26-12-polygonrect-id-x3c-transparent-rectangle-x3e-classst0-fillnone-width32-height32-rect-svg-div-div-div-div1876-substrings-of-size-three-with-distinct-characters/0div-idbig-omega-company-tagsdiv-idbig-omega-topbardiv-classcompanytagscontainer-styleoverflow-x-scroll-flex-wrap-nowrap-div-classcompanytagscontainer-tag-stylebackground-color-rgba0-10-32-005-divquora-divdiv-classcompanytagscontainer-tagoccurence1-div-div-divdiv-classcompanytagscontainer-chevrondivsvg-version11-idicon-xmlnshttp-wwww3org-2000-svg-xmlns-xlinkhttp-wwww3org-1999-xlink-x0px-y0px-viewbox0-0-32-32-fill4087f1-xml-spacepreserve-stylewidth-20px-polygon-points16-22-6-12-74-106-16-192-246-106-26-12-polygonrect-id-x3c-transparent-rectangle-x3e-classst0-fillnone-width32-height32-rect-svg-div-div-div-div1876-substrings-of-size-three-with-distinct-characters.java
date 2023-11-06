class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3){
            return 0;
        }
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<3;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        if(map.size()==3){
            count++;
        }
        
        for(int i=3;i<s.length();i++){
            //old remove
            char lastCh=s.charAt(i-3);
            if(map.get(lastCh)==1){
                map.remove(lastCh);
            }else{
                map.put(lastCh,map.get(lastCh)-1);
            }
            
            //new add
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            if(map.size()>=3){
                count++;
            }
        }
        return count;
    }
}