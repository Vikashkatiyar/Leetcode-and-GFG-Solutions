class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-2;i>=0;i--){
            while(st.size()>0 && nums[i]>=st.peek()){
                st.pop();
            }
            st.push(nums[i]);
        }
        
        int []res=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(st.size()>0 && nums[i]>=st.peek()){
                st.pop();
            }
            if(st.size()>0){
                res[i]=st.peek();
            }else{
                res[i]=-1;
            }
            st.push(nums[i]);
        }
        return res;
    }
}