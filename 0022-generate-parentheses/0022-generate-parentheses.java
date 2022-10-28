class Solution {
    
    // There only two conditions important
    //     1.left<n
    //     2.right<left
        
        
    public List<String> generateParenthesis(int n) {
      List<String> list=new ArrayList<>();
        func(list,0,0,"",n);
        return list;
    }
    
    public void func(List<String> list,int left,int right,String s,int n){
        if(s.length()==n*2){
            list.add(s);
            return;
        }
        
        if(left<n){
            func(list,left+1,right,s+"(",n);
        }
        
        if(right<left){
            func(list,left,right+1,s+")",n);
        }
    }
}