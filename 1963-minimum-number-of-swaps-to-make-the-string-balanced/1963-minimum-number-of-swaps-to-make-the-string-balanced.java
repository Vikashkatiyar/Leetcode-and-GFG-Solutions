class Solution {
    public int minSwaps(String s) {
        int count=0;
        Stack<Character> st=new Stack<>();
        for(Character ch:s.toCharArray()){
            if(ch=='['){
                st.push(ch);
                
            }else if(ch==']'){
                if(st.size()!=0 && st.peek()=='['){ // pop the balanced brackets pair
                    st.pop();
                }else{
                    count++;
                }
            }
        }
        return (count+2-1)/2;
        
        //x/y -> gives me floor value of x/y
        // (x+y-1)/y -> gives theceil value of x/y
    }
}