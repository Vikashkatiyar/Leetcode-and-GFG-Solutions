class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
//         String [] brokenList=brokenLetters.split("");
//         int count=0;
//         for(String str:text.split(" ")){
//             for(String b:brokenList){
//                 if(str.contains(b) && !b.isBlank()){
//                     count++;
//                     break;
//                 }
//             }
//         }
               
// return text.split(" ").length-count;
        
        
        String[] brokenList=brokenLetters.split("");
        int count=0;
        for (String str:text.split(" ")) {
            for (String b: brokenList) {
                if(str.contains(b) && !b.isBlank()){
                    count++;
                    break;
                }
            }
        }
        return text.split(" ").length-count;
    }
}