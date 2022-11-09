class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int val:asteroids){
            if(val>0){
                st.push(val);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(val)){
                    st.pop();
                }
                
                if(st.size()==0){
                    st.push(val);
                }else if(st.peek()<0){
                    st.push(val);
                }else if(st.peek()==Math.abs(val)){
                    st.pop();
                }
                else if(st.peek()>Math.abs(val)){
                 // do nothing
                }
            }
        }
        
        int [] res=new int[st.size()];
        int idx=res.length-1;
        while(!st.isEmpty()){
            res[idx--]=st.pop();
        }
        return res;
    }
}