class Solution {
    public String longestCommonPrefix(String[] str) {
        int size=str.length;
        if(size==0)
            return "";
        if(size==1)
            return str[0];
        
        Arrays.sort(str);
        int end=Math.min(str[0].length(),str[size-1].length());
        
        int i=0;
        while(i<end && str[0].charAt(i)==str[size-1].charAt(i)){
            i++;
        }
        String pre=str[0].substring(0,i);
        return pre;
    }
}