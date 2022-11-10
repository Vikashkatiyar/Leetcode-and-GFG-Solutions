class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> st=new Stack<>();
        for(Character ch:S.toCharArray()){
            if(st.size()!=0 && st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}