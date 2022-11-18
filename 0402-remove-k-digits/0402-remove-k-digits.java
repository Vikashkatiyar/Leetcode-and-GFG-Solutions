class Solution {
    //Next greater element with constraint 
    //same as remove duplicate letters
    public String removeKdigits(String num, int k) {
        if(k==num.length()){
            return "0";
        }
        
        Stack<Character> st=new Stack<>();
        st.push(num.charAt(0));
        for(int i=1;i<num.length();i++){
            char ch=num.charAt(i);
            while(st.size()>0 && k>0 && ch<st.peek()){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        
        while(k>0){
            st.pop();
            k--;
            
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)=='0'){
                sb.deleteCharAt(i);
            }else{
                break;
            }
        }
        String s=sb.reverse().toString();
        
        return s.length()>0?s:"0";
    }
}