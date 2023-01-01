class Solution {
    public boolean wordPattern(String pattern, String str) {
        String []words=str.split(" ");
         if(words.length!=pattern.length()){
             return false;
         }
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Boolean> used=new HashMap<>();
         
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            
            if(map.containsKey(ch)==false){ //agar character nahi use hua abhi
                if(used.containsKey(words[i])==true){ //word pahle hi use ho chuka h
                    return false;
                }else{
                    used.put(words[i],true); 
                    map.put(ch,words[i]);
                }
            }else{
                String mwith=map.get(ch); //agar character use hua h pahle
                if(mwith.equals(words[i])==false){ //too usss par rakhi string current string hi honi chahiye
                    return false;
                }
            }
        }
        return true;
    }
}