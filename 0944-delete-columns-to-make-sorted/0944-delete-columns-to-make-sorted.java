class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        
        for(int i=0;i<strs[0].length();i++){
            char pch=strs[0].charAt(i);
            for(String s:strs){
               if(s.charAt(i)<pch){
                   count++;
                   break;
               }
                pch=s.charAt(i);
            }
        }
        return count;
    }
}