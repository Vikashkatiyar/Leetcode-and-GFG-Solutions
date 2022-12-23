class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> star=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else if(ch==')'){
                if(st.size()>0){
                    st.pop();
                }else if(star.size()>0){
                    star.pop();
                }else{
                    return false;
                }
            }else{
                star.push(i);
            }
        }
        
        while(!st.isEmpty()){
            if(star.isEmpty()){
                return false;
            }
            else if(st.peek()<star.peek()){ //   "(*"
                 st.pop();
                 star.pop();
            }
            else {
                return false;
            }
        }
        
        return true;
        
    }
}