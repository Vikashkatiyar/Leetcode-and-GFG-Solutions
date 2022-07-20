class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<Character,Queue<String>> map=new HashMap<>();
        int ans=0;
        
        for(int i=0;i<s.length();i++){//push all charactr of s
            map.putIfAbsent(s.charAt(i),new LinkedList<>());
        }
        
        
        for(String word:words){  //map all word towards the character of each s
            char startchar=word.charAt(0);
            if(map.containsKey(startchar)){
                map.get(startchar).offer(word);
            }
        }
        
        for(int i=0;i<s.length();i++){
            char startchar=s.charAt(i);
            Queue<String> q=map.get(startchar);
            int size=q.size();
            for(int k=0;k<size;k++){
                String str=q.poll();
                if(str.substring(1).length()==0){
                    ans++;
                }else{
                    if(map.containsKey(str.charAt(1))){
                        map.get(str.charAt(1)).add(str.substring(1));
                    }
                }
            }
        }
        return ans;
    }
}