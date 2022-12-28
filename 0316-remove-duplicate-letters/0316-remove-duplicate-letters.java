class Solution {
    public String removeDuplicateLetters(String s) {
        char []arr=s.toCharArray();
        int []freq=new int[26];
        for(char ch:arr){
            freq[ch-'a']++;
        }
        
        boolean []check=new boolean[26];
        Stack<Character> st=new Stack<>();
        for(char ch:arr){
            freq[ch-'a']--;
            
            if(check[ch-'a']==false){
                while(st.size()>0 && freq[st.peek()-'a']>0 && ch<st.peek()){
                    check[st.peek()-'a']=false;
                    st.pop();
                }
                
                st.push(ch);
                check[ch-'a']=true;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
    }
}