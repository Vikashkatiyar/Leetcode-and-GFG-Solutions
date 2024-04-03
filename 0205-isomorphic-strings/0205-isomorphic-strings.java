class Solution {
    
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map=new HashMap<>();
        
        if(s.length()!=t.length()){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            char original= s.charAt(i);
            char replace =t.charAt(i);
            
            if(!map.containsKey(original)){
                if(!map.containsValue(replace)){
                    map.put(original, replace);
                }else{
                    return false;
                }
            }else{
                //if Original Char already occupied with someone then check with that replacement is same 
                char mappedChar=map.get(original);
                if(mappedChar!=replace){
                    return false;
                }
            }
        }
        
        return true;
    }
}