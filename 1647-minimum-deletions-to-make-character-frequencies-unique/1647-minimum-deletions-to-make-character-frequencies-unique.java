class Solution {
    public int minDeletions(String s) {
        int deletion=0;
        int []freq=new int[26];
        for(char c:s.toCharArray()){
                freq[c-'a']++;
        }
        
        Set<Integer> st=new HashSet<>();
        for(int count:freq){
            while(count>0 && st.contains(count)){
                deletion++;
                count--;
            }
            st.add(count);
            
        }
        return deletion;
        
    }
}