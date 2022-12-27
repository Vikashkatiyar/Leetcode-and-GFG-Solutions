class Solution {
     // refer->https://www.youtube.com/watch?v=7ZEAiTHiDuA
    public int maximumGroups(int[] grades) {
        return (int) ((Math.sqrt(grades.length * 8 + 1) -1) / 2);
    }
}


    
    