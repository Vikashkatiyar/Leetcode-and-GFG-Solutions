class Solution {
    public int minSteps(String s, String t) {
       int []arr=new int[26];
        
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        
        for(char ch:t.toCharArray()){
            arr[ch-'a']--;
        }
        int count=0;
        for(int i:arr){
            count+=Math.abs(i);
        }
        return count;
    }
}