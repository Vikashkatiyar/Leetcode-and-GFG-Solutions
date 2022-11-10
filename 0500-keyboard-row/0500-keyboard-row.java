class Solution {
    public String[] findWords(String[] words) {
        String str1="qwertyuiopQWERTYUIOP";
        String str2="asdfghjklASDFGHJKL";
        String str3="zxcvbnmZXCVBNM";
        ArrayList<String> list=new ArrayList<>();
        
        for(String word:words){
            int m=0,n=0,p=0;
            for(Character ch:word.toCharArray()){
                if(str1.contains(ch+"")){
                    m++;
                }else if(str2.contains(ch+"")){
                    n++;
                }else if(str3.contains(ch+"")){
                    p++;
                }
            }
            
            if(word.length()==m || word.length()==n || word.length()==p){
                list.add(word);
            }
        }
        String [] str=new String[list.size()];
        list.toArray(str);
        return str;
    }
}