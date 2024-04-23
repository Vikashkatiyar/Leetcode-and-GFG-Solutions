class Solution {
    public int numberOfSpecialChars(String word) {
        int a[]=new int[26];
        int b[]=new int[26];
        for(char c: word.toCharArray())
        {
            if(c>='a' && c<='z')
            {
                a[c-'a']++;
            }
            else
            {
                b[c-'A']++;
            }
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(a[i]!=0 && b[i]!=0)
            {
                count++;
            }
        }
        return count;
    }
}