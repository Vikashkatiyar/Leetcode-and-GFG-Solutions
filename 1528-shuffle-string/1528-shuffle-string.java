class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> hm=new HashMap<>();
        
        for(int i=0;i<indices.length;i++){
           hm.put(indices[i],s.charAt(i)); 
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(hm.get(i)!=null){
                sb.append(hm.get(i));
                hm.remove(i);
            }
        }
        
        return sb.toString();
        
        
    }
}