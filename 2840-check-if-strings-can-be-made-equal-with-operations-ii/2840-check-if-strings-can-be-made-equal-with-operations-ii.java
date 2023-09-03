class Solution {
    //O(n)
    //O(N)
    public boolean checkStrings(String s1, String s2) {
        int n=s1.length();
        
        int []odd=new int[26];
        int []even=new int[26];
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[s1.charAt(i)-'a']++;
                even[s2.charAt(i)-'a']--;
            }else{
                odd[s1.charAt(i)-'a']++;
                odd[s2.charAt(i)-'a']--;
            }
        }
        
        for(int i=0;i<odd.length;i++){
            if(odd[i]!=0 || even[i]!=0){
                return false;
            }
        }
        return true;
    }
}