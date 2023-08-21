class Solution {
    public boolean isSolvable(String[] words, String result) {
        int[] map=new int[26];
        Arrays.fill(map,-2);
        
        StringBuilder uniqStr=new StringBuilder();
        Set<Character> set=new HashSet<>();
        for(String word :words){
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                
                if(i==0 && word.length()>1){
                    set.add(ch);
                }
                
                if(map[ch-'A']== -2){
                    map[ch-'A']= -1;
                    uniqStr.append((char)ch);
                }
            }
        }
        
        for(int i=0;i<result.length();i++){
                char ch=result.charAt(i);
                
                if(i==0 && result.length()>1){
                    set.add(ch);
                }
                
                if(map[ch-'A']==-2){
                    map[ch-'A']=-1;
                    uniqStr.append((char)ch);
                }
            }
        
        boolean [] usedNum=new boolean[10];
        
        return solve(words,result,0,uniqStr.toString(),set,map,usedNum);
    }
    
    public boolean solve(String[] words, String result, int idx, String uniqStr,Set<Character> set,int[] map, boolean[] usedNum){
        
        if(idx==uniqStr.length()){
            if(isValid(map,words,result)){
                return true;
            }
            
            return false;
        }
        
        
        
        for(int i=0;i<usedNum.length;i++){
            if(usedNum[i]==false){
                if(i==0 && set.contains(uniqStr.charAt(idx))){
                    continue;
                }
                
                map[uniqStr.charAt(idx)-'A']=i;
                usedNum[i]=true;
                
                if(solve(words,result,idx+1,uniqStr.toString(),set,map,usedNum)){
                    return true;
                }
                
                usedNum[i]=false;
                map[uniqStr.charAt(idx)-'A']=-1;
                
            }
        }
        return false;
    }


public boolean isValid(int[] map,String [] words , String result){
        int sum=0;
        for(String word:words){
            int num=getNum(word,map);
            sum+=num;
        }

        int target=getNum(result, map);

        if(sum==target){
            return true;
        }
        return false;
   }
    
 public int getNum(String s, int[] map){
      int num = 0;
        for(int i=0; i < s.length(); i++) {
            num = num * 10 + map[s.charAt(i) - 'A'];
        }
        
        return num;
 }
    
}
