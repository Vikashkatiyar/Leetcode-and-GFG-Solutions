class Solution {
    public int countPalindromicSubsequence(String s) {
        int []first=new int[26];
        Arrays.fill(first,Integer.MAX_VALUE);
        int []last=new int[26];
         for (int i = 0; i < s.length(); ++i) {
            first[s.charAt(i) - 'a'] = Math.min(first[s.charAt(i) - 'a'], i);//first occurence of the character
            last[s.charAt(i) - 'a'] = i;//last occurence of the character
        }
        
        
        // distict elements between two same characters give the count of palindromic String
        int count=0;
        for(int i=0;i<26;i++){
            if(first[i]<last[i]){
               count+=s.substring(first[i]+1,last[i]).chars().distinct().count(); 
            }
        }
        return count;
    }
}