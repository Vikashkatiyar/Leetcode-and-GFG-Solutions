class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] alien=new int[26];
        for(int i=0;i<26;i++){
            alien[order.charAt(i)-'a']=i;
        }

        for(int i=1;i<words.length;i++){
            if(compare(words[i-1],words[i],alien)==false){
                return false;
            }
        }
        return true;
    }
    boolean compare(String a,String b,int[] alien){
       int i=0;
       while(i<a.length() && i<b.length()){
           if(a.charAt(i)==b.charAt(i)){ //alien[a.charAt(i)-'a']==alien[b.charAt(i)-'a']
               i++;
           }
           else if(alien[a.charAt(i)-'a']<alien[b.charAt(i)-'a']){
               return true;
           }else{
               return false;
           }
       }
       if(a.length()>b.length()){
           return false;
       }
       return true;
    }
}
