class Solution {
    public List<String> commonChars(String[] words) {
        int[] last=count(words[0]);
        for(String word: words){
            last=intersection(last,count(word));
        }
        
        List<String> ans=new ArrayList<>();
        for(int i=0;i<26;i++){
               
            if(last[i]!=0){
                char ch=(char)('a'+i);
                String temp=String.valueOf(ch);
                while(last[i]-->0){
                    ans.add(temp);
                }
            }
            
        }
        
        return ans;
        
    }
    
    private int[] intersection(int[] f1, int[] f2){
        int[] ans=new int[26];
        
        for(int i=0;i<26;i++){
            ans[i]=Math.min(f1[i], f2[i]);
        }
        
        return ans;
    } 
    
    private int[] count(String str){
        int[] ans=new int[26];
        for(char ch: str.toCharArray()){
            ans[ch-'a']++;
        }
        
        return ans;
    }
}