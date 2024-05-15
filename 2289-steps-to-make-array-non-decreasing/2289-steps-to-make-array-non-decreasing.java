class Solution {
    public int totalSteps(int[] nums) {
        Stack<int[]> st = new Stack<>();
        for (int i = nums.length -1; i >= 0; --i) {
            int cnt = 0;
            while (!st.isEmpty() && st.peek()[1] < nums[i]) {
                cnt=Math.max(cnt + 1, st.peek()[0]);
                st.pop();
            }
            st.push(new int[] {cnt, nums[i]});
        }
        int max=Integer.MIN_VALUE;
        for (int[] val : st) {
            max=Math.max(val[0], max);
        }
        return max;
    }
}