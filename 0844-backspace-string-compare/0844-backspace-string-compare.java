class Solution {
    public boolean backspaceCompare(String s, String t) {
        String fr=process(s);
        String sc=process(t);
        return fr.equals(sc);
    }
    public String process(String s){
        Stack<Character> st=new Stack<>();
        for(Character ch:s.toCharArray()){
            if(ch!='#'){
                st.push(ch);
            }else if(ch=='#' && st.size()>0){
                st.pop();
            }
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}