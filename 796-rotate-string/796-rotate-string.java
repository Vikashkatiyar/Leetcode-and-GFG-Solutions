class Solution {
    public boolean rotateString(String s, String goal) {
        String s1=s+s;
        return (s.length()==goal.length() && s1.indexOf(goal)!=-1)?true:false;
    }
}