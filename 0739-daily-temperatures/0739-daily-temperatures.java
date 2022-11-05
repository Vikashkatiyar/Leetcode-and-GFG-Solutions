class Solution {
    // TC:O(n)
        
    public int[] dailyTemperatures(int[] temp) {
        int len=temp.length;
        int[] ans=new int[len];
        
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<len;i++){
            while(!st.isEmpty() && temp[st.peek()]<temp[i]){
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}