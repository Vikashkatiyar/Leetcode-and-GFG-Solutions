class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        //Jai Shree Ram
        HashMap<String, Integer> map=new HashMap<>();
        
        
        for(String cpdomain: cpdomains){
            int j=cpdomain.indexOf(' ');
            int val=Integer.valueOf(cpdomain.substring(0,j));
            String domain=cpdomain.substring(j+1);
            
            for(int i=0;i<domain.length();i++){
                if(domain.charAt(i)=='.'){
                    String s=domain.substring(i+1);
                    map.put(s,map.getOrDefault(s,0)+val);
                }
            }
            
            map.put(domain,map.getOrDefault(domain,0)+val);
        }
        
        List<String> ans=new ArrayList<>();
        for(String str: map.keySet()){
            ans.add(map.get(str)+" "+str);
        }
        
        return ans;
    }
}