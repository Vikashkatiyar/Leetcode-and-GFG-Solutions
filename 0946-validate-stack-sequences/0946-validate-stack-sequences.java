class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int j=0;
        for(int num:pushed){
            st.push(num);
            while(st.size()>0 && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }
        return j==popped.length;
    }
}