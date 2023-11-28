class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map=new HashMap<>();
        for(List<String> str: knowledge){
            String key=str.get(0);
            String value=str.get(1);
            
            map.put(key,value);
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('){
               int start=i+1;
                
                while(i<s.length() && s.charAt(i)!=')'){
                    i++;
                }
                sb.append(map.getOrDefault(s.substring(start,i),"?"));
            }else{
                sb.append(ch);
            }
            
            
        }
        
        return sb.toString();
    }
}