class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stk=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            switch(tokens[i]){
                case "+":
                    stk.push(stk.pop()+stk.pop());
                    break;
                case "-":
                    stk.push(-stk.pop()+stk.pop());
                    break;
                case "*":
                    stk.push(stk.pop()*stk.pop());
                    break;
                case "/":
                    int a=stk.pop();
                    int b=stk.pop();
                    stk.push(b/a);
                    break;
                default:
                    stk.push(Integer.parseInt(tokens[i]));
            }
        }
        return stk.pop();
        
    }
}