class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        
        List<Integer> list=new ArrayList<Integer>();
        
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*'){
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                List<Integer> al = diffWaysToCompute(left);
                List<Integer> bl = diffWaysToCompute(right);
                
                
                for (int x : al) {
                    for (int y : bl) {
                        if (ch == '-') {
                            list.add(x - y);
                        } else if (ch == '+') {
                            list.add(x + y);
                        } else if (ch == '*') {
                            list.add(x * y);
                        }
                    }
                }
                 
            }
        }
        
         if (list.size() == 0) 
             list.add(Integer.valueOf(expression));
        
        
         return list;
    }
}