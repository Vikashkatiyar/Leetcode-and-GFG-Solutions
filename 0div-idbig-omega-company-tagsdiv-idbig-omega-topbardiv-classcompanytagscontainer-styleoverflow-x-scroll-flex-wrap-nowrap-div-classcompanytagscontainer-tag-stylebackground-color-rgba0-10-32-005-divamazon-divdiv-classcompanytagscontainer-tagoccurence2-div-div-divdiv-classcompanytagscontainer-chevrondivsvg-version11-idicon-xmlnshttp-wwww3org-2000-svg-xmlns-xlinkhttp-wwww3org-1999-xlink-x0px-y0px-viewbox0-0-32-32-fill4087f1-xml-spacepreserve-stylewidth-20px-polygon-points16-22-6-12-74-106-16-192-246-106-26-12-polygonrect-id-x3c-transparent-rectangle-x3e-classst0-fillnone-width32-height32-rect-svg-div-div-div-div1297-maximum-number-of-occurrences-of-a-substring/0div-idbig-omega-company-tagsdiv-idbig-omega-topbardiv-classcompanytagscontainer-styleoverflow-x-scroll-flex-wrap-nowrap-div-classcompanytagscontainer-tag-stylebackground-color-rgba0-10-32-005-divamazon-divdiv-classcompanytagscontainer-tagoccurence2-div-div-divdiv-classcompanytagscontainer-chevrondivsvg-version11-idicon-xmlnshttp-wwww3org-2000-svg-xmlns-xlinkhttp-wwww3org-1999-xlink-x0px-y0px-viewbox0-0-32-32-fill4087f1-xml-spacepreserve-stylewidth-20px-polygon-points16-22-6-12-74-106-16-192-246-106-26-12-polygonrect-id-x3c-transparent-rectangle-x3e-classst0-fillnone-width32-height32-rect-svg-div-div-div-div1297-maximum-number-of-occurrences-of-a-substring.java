class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> ans=new HashMap<>();
        int start=0,end=0;
        Map<Character, Integer> count=new HashMap<>();
        
        while(end < s.length()){
            Character ch=s.charAt(end);
            count.put(ch,count.getOrDefault(ch,0)+1);
            
            while(end-start+1 > minSize ){
                Character c=s.charAt(start);
                if(count.get(c)==1){
                    count.remove(c);
                }else{
                    count.put(c,count.get(c)-1);
                }
                start++;
            }
            
            if(count.size() <= maxLetters && end-start+1 >= minSize){
                String temp=s.substring(start, end+1);
                ans.put(temp, ans.getOrDefault(temp,0)+1);
            }
            
            end++;
        }
        
        int max=0;
        for(int it:ans.values()){
            max=Math.max(max,it);
        }
        return max;
    }
}