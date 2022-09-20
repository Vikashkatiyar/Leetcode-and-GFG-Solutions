class Solution {
    public int minDeletion(int[] nums) {
        
        //         Logic
//   first we will push array first element then there are 2 condtions 
//   1.stack size is even 
//    if stack size is even we have to push element in stack
//    because it will not follow i%2==0 rule
//         
//  
// 2.stack size is odd
// i.if the element is equal to the peek element
//   we will not push in stack
// ii.if the element in stack is not equal we will push 
//    element in stack
        
        
        
        
        Stack<Integer> stk=new Stack<>();
        stk.push(nums[0]);
        int i=1;
        int count=0;
        while(i<nums.length){
            if(stk.size()%2==0){
                stk.push(nums[i]);
            }
            else{
                if(stk.peek()==nums[i]){
                    count++;
                }else{
                    stk.push(nums[i]);
                }
            }
            i++;
        }
        
        return stk.size()%2==0?count:count+1;
    }
}