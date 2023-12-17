class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int ans=0;
        
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                
                if(isValid(sb.toString())){
                    ans=Math.max(ans, j-i+1);
                }
            }
        }
        
        return ans;
    }
    
    public boolean isValid(String s){
        int pair=0;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                pair++;
            }
        }
        
        return pair<=1;
    }
}