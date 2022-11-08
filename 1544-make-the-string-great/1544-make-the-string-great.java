class Solution {
    public String makeGood(String s) {
      Stack<Character> st=new Stack<>();
        
        for(Character ch:s.toCharArray()){
            
            if(!st.isEmpty() && Math.abs(st.peek()-ch)==32){
                st.pop();
                
            }
            else{
                st.push(ch);
            }
        }
        
        if(st.size()>0){
            char[] arr=new char[st.size()];
            int i=st.size()-1;
            while(!st.isEmpty()){
                arr[i]=st.pop();
                i--;
            }

            return new String(arr);
        }else{
            return "";
        }
        
        
    }
}