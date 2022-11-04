class Solution {
  
    public String reverseVowels(String s) {
        String str="aeiouAEIOU";
        StringBuilder sb=new StringBuilder(s);
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && str.indexOf(sb.charAt(left))==-1){
                left++;
            }
            while(left<right && str.indexOf(sb.charAt(right))==-1){
                right--;
            }
            
            char ch=sb.charAt(left);
            sb.setCharAt(left,sb.charAt(right));
            sb.setCharAt(right,ch);
            
            left++;
            right--;
        }
        return sb.toString();
    }
}