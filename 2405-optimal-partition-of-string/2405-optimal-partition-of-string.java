class Solution {
    public int partitionString(String s) {
        HashSet<Character> set=new HashSet<>();
        int count=0;
        for(char c:s.toCharArray()){
            
            if(set.contains(c)){
                count++;
                set=new HashSet<>();
                set.add(c);
            }else{
                set.add(c);
            }
        }
        if(!set.isEmpty())
            count++;
        return count;
    }
}