class Solution {
    public List<List<String>> partition(String s) {
        
      List<List<String>> res=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        helper(0,s,temp,res);
        return res;
    }
    
    public void helper(int idx,String s,List<String> temp,List<List<String>> res){
        if(idx==s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=idx;i<s.length();i++){
            String lstr=s.substring(idx,i+1);
            if(isPalindrome(lstr)){
                temp.add(lstr);
                helper(i+1,s,temp,res);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}