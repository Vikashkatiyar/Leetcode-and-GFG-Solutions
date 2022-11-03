class Solution {
    public int[] secondGreaterElement(int[] nums) {
        int n=nums.length;
        int []res=new int[nums.length];
        Arrays.fill(res,-1);
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        Stack<Integer> temp=new Stack<>();
        
        for(int i=0;i<nums.length;i++){
            while(!s2.empty() && nums[s2.peek()]<nums[i]){
                res[s2.pop()]=nums[i];
            }
            
            while(!s1.empty() && nums[s1.peek()]<nums[i]){
                temp.push(s1.pop());
            }
            
            while(!temp.empty()){
                s2.push(temp.pop());
            }
            
            s1.push(i);
        }
        return res;
    }
}