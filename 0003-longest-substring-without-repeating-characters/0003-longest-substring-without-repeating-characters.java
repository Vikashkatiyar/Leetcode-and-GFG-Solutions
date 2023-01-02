class Solution {
    public int lengthOfLongestSubstring(String S) {
         Set<Character> set=new HashSet<>();
        int i=0,j=0,len=0;
        while(j<S.length()){
            if(set.add(S.charAt(j))){
                len=Math.max(len,j-i+1);
                j++;
            }else{
                set.remove(S.charAt(i));
                i++;
            }
        }
        return len;
    }
}