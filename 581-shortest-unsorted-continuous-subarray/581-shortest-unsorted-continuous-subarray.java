class Solution {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> stk=new Stack<>();
        int left=nums.length-1;
       
        //traverse  left to right and check if any break point occurs then 
        //find left most index
        for(int i=0;i<nums.length;){
            if(stk.isEmpty()){
                stk.push(i);
                i++;
            }
            else{
                if(nums[stk.peek()]>nums[i]){
                left=Math.min(left,stk.peek());
                stk.pop();
                }
                else{
                    stk.push(i);
                    i++;
                }
            
            }
                
        }
        
        stk.clear();
        
        
        //traverse right to left and check if any break point occurs then 
        //find right most index
        int right=0;
        for(int i=nums.length-1;i>=0;){
            if(stk.isEmpty()){
                stk.push(i);
                i--;
            }
            else{
                if(nums[stk.peek()]<nums[i]){
                    right=Math.max(right,stk.peek());
                    stk.pop();
                }
                else{
                    stk.push(i);
                    i--;
                }
            }
        }
        
        if(left>=right){
            return 0;
        }else{
            return right-left+1;
        }
        
    }
}