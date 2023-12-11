class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        
        boolean flag=false;
        while(i<word1.length() && j<word2.length()){
            flag=!flag;
            if(flag){
                sb.append(word1.charAt(i));
                i++;
            }else{
                sb.append(word2.charAt(j));
                j++;
            }
        }
        
        while(i<word1.length()){
            sb.append(word1.charAt(i));
                i++;
        }
        
        while(j<word2.length()){
            sb.append(word2.charAt(j));
                j++;
        }
        
        return sb.toString();
        
    }
}