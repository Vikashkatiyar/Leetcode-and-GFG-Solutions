class Solution {
    public String smallestNumber(String s) {
       StringBuilder res=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        
        for(int i=0;i<=s.length();i++){
            temp.append((char)('1'+i));
            if(i==s.length() || s.charAt(i)=='I' ){
                res.append(temp.reverse());
                temp=new StringBuilder();
            }
        }
        
        return res.toString();
    }
}