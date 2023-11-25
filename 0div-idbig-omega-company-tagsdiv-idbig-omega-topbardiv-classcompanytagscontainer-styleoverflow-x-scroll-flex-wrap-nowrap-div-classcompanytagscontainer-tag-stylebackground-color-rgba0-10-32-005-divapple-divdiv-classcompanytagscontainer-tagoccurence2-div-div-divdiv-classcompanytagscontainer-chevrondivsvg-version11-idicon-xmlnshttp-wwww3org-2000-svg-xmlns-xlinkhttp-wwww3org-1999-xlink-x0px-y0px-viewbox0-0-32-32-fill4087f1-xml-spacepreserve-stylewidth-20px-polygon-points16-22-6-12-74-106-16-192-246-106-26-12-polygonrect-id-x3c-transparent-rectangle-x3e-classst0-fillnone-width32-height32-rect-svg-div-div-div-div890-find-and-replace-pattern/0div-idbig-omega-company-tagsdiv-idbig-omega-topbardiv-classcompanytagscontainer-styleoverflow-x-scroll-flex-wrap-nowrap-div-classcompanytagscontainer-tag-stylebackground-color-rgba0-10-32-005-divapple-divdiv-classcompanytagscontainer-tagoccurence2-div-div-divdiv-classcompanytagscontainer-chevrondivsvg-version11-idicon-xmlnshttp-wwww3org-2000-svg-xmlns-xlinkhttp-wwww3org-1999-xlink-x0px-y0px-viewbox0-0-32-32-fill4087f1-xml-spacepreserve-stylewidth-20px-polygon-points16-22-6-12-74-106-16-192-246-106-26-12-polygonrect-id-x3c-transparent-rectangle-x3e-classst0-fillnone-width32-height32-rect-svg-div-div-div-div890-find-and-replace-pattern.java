class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        //Jai Shree Ram
        List<String> ans=new ArrayList<>();
        
        for(String word: words){
            if(isMatching(word, pattern)){
                ans.add(word);
            }
        }
        
        return ans;
    }
    public boolean isMatching(String word, String pattern){
        HashMap<Character, Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        
        
        for(int i=0;i<pattern.length();i++){
            char wch=word.charAt(i);
            char pch=pattern.charAt(i);
            
            if(map.containsKey(pch)==true){
                //charcters are  Mappped
                if(map.get(pch)!=wch){
                    return false;
                }
            }else{
                // charcters are not mapped
                if(set.contains(wch)){
                    return false;
                }
                map.put(pch, wch);
                set.add(wch);
            }
        }
        
        return true;
    }
}