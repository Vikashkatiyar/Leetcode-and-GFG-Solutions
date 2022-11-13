class Solution {
    public String reverseWords(String s) {
        String []str=s.split(" ");
       StringBuilder sb=new StringBuilder();
        // String [] res=new String[str.length()];
       for(int i=str.length-1;i>=0;i--){
           if(str[i].isEmpty()==false)
             sb.append(str[i]+" ");
       }
        return sb.toString().trim();
    }
}