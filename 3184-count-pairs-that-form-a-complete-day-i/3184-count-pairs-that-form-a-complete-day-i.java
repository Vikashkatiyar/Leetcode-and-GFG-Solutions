class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int count = 0;
        int n = hours.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    ++count;
                }
            }
        }
        return count;
    }
}