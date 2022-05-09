class Solution {
    public List<String> letterCombinations(String digits) {
         String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        List<String> ans=new ArrayList<>();
        if(digits==null || digits.length()==0){
            return ans;
        }
        helper(ans,digits,mapping,0,"");
        return ans;
    }
    private void helper(List<String> ans,String digits,String [] mapping,int index,String currString){
        if(index==digits.length())
        {
            ans.add(currString);
            return ;
        } 
        String possiblechar=mapping[digits.charAt(index)-'0'];
        for(char c: possiblechar.toCharArray()){
            helper(ans,digits,mapping,index+1,currString+c);
        }
    }
}