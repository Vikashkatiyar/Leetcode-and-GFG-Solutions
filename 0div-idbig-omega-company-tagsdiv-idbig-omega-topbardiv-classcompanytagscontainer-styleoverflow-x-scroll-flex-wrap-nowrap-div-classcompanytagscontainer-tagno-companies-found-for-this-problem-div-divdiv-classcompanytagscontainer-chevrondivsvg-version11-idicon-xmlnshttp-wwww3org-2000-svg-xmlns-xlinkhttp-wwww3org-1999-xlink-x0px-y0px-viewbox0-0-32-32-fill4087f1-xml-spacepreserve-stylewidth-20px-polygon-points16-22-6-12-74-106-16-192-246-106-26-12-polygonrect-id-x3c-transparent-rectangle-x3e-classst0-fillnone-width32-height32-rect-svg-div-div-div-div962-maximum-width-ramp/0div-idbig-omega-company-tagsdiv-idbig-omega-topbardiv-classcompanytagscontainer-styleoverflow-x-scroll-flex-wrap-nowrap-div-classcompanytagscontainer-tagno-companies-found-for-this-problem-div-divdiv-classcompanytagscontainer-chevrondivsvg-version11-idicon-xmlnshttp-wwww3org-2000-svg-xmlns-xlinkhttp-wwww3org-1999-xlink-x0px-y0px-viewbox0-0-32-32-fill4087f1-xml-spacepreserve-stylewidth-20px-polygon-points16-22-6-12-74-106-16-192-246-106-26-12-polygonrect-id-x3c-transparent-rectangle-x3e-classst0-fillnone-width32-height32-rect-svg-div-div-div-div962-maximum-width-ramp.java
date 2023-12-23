class Solution {
    
    public int maxWidthRamp(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        
        // left to right fill in decresing order
        for(int i=0;i<n;i++){
            if(st.empty() || nums[st.peek()] > nums[i]){
                st.push(i);
            }
        }
        
        //right to left get the first heightest number index
        int ramp=0;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<= nums[i]){
                ramp=Math.max(ramp, i-st.pop());
                
            }
        }
        
        return ramp;
    }
}





