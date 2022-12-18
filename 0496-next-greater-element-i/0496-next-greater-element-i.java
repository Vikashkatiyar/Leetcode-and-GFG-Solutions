class Solution {
    public int[] nextGreaterElement(int[] query, int[] nums) {
        int []nge=nextGreaterRight(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],nge[i]);
            
        }
        
        int []res=new int[query.length];
        for(int i=0;i<query.length;i++){
            res[i]=map.get(query[i]);
        }
        return res;
    }
    
    public static int [] nextGreaterRight(int []nums){
        Stack<Integer> st=new Stack<>();
        st.push(nums[nums.length-1]);
        int []ans=new int[nums.length];
        ans[ans.length-1]=-1;
        for(int i=nums.length-2;i>=0;i--){
            while(st.size()>0 && nums[i]>st.peek()){
                st.pop();
            }
            
            ans[i]=st.size()>0?st.peek():-1;
            
            st.push(nums[i]);
        }
        return ans;
    }
}