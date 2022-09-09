class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->b.length()-a.length());
        
        for(char c:s.toCharArray()){
            int count=map.getOrDefault(c,0);
            //if c has then give that freq or give zero
            
            map.put(c,++count);
        }
        
        
        for(Character c:map.keySet()){
            StringBuilder sb=new StringBuilder();
            int len=map.get(c);
            
            for(int i=0;i<len;i++){
                sb.append(c+"");
            }
            pq.add(sb.toString());
        }
        
        StringBuilder res=new StringBuilder();
        while(!pq.isEmpty()){
            res.append(pq.poll());
        }
        
        return res.toString();
        
        
    }
}