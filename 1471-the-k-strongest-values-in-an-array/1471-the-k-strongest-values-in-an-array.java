class Solution {
    public int[] getStrongest(int[]nums, int k) {
       int[] res = new int[k];
        Arrays.sort(nums);
        int size = nums.length;
        int m = (size - 1) / 2;
        int median = nums[m];
        int index = 0;
        int left = 0, right = size - 1;
        while (left <= right){
            if ((nums[right] - median) >= (median - nums[left]))
                res[index++] = nums[right--];
            else
                res[index++] = nums[left++];
            if (index == k)
                break;
        }
        return res;
    }
}