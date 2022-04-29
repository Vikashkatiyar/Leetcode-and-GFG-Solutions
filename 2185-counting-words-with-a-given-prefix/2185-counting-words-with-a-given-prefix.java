class Solution {
    public int prefixCount(String[] words, String pref) {
        if(pref.length()==0)
            return 0;
        int res = 0; 
        for(int i=0;i<words.length;i++){
            String temp="";
            if(words[i].length()>=pref.length()){
                temp=words[i].substring(0,pref.length());
            }
            if(pref.equals(temp)){
                res++;
            }
        }
        return res;
    }
}




//second method


// class Solution {
//     public int prefixCount(String[] words, String pref) {
        
//         int res = 0; 
//         for(int i = 0; i<words.length; i++){
//             if(words[i].startsWith(pref)){
//                 //startsWith()method applicable on String in java
//                res++; 
//             }
//         }
//         return res; 
//     }
// }
