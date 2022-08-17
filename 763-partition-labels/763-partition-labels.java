class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        
        int start=0;
        int last=0;
        
        for(int i=0;i<s.length();i++){
            last=Math.max(map.get(s.charAt(i)),last);
            if(i==last){
                list.add(last-start+1);
                start=i+1;
                last++;
            }
        }
        return list;
    }
}