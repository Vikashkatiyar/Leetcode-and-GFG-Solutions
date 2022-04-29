class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk=new Stack<>();
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)==')'){
                Queue<Character> q=new LinkedList();
                 while(stk.peek()!='('){
                     q.add(stk.pop());
                 }
                 stk.pop();
                 while(q.size()>0){
                     stk.push(q.remove());
                 }
             }
             else{
                 stk.push(s.charAt(i));
             }
         }
        char []arr=new char[stk.size()];
        int i=arr.length-1;
        while(i>=0){
            arr[i]=stk.pop();
            i--;
        }
        return new String(arr);
    }
}