class Solution {
    public char findKthBit(int n, int k) {
        String result=findSn(n,"");
        return result.charAt(k-1);
    }
    public String findSn(int n,String result){
        if(n==1){
            return "0";
        }
        String result1=findSn(n-1,result);
        result=result1+"1"+reverse(invert(result1));
        return result;
    }
    
    private String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    
    private String invert(String s){
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='1')
                sb.append("0");
            else
                sb.append("1");
        }
        return sb.toString();
    }
}