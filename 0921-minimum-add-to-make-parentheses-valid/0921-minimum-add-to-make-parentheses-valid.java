class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(Character ch:s.toCharArray()){
            if(ch=='('){
                st.push('(');
            }else if(ch==')'){
                if(st.size()==0 || st.peek()==')'){
                    st.push(')');
                }else if(st.peek()=='('){
                   st.pop();
                }
            }
        }
        return st.size();
    }
}