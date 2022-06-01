class Solution {
    public int minFlips(String target) {
        char f='0';
        int count=0;
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)!=f){
                f=target.charAt(i);
                count++;
            }
        }
        return count;
    }
}