class Solution {    
    public int[] dailyTemperatures(int[] temp) {
        int[] ans=new int[temp.length];
        Stack<Integer> st=new Stack<>();
        st.push(temp.length-1);
        for(int i=temp.length-2;i>=0;i--){
            
            while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
                st.pop();
            }
            
            if(st.size()>0){
                ans[i]=st.peek()-i;
            }
            
            st.push(i);
        }
        return ans;
    }
}