class Solution {
    ArrayList<List<String>> ans;
    public List<List<String>> partition(String s) {
        ans=new ArrayList<>();
        helper(s,new ArrayList<String>());
        return ans;
    }
    
    public void helper(String str,ArrayList<String> asf){
        if(str.length()==0){
            ans.add(new ArrayList<>(asf));
            return;
        }
        
        
        
        for(int i=0;i<str.length();i++){
            String sub=str.substring(0,i+1);
            String ros=str.substring(i+1);
            if(isPalindrome(sub)){
                asf.add(sub);
                helper(ros,asf);
                asf.remove(asf.size()-1);
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