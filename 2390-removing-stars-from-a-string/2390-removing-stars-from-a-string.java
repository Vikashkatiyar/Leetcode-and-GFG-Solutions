class Solution {
    public String removeStars(String s) {
        char []arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(arr[i]>='a' && arr[i]<='z'){
                st.push(arr[i]);
            }else if(arr[i]=='*'){
                st.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()>0){
            sb.append(st.pop());
        }
        return sb.length()>0?sb.reverse().toString():"";
    }
}