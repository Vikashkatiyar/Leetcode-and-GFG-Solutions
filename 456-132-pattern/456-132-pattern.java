class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
       
       //find minimum array  
        int []min=new int[n];
        min[0]=nums[0];
        for(int i=1;i<n;i++){
            min[i]=Math.min(min[i-1],nums[i]);
        }
        
        
        //making stack and check three conditions
        Stack<Integer> st=new Stack<>();
        boolean found =false;
        for(int j=n-1;j>=0;j--){
            while(st.size()>0 && st.peek()<=min[j])  //step no 1.
                st.pop();
            if(st.size()>0 && st.peek()<nums[j]){    // step no 2.
                found=true;
                break;
            }
            
            st.push(nums[j]);   //step 3.
                
        }
        return found;
        
    }
}