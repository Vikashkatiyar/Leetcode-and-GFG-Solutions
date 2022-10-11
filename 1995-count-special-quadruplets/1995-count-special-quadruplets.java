class Solution {
    public int countQuadruplets(int[] nums) {
        int res = 0;
        for (int i1 = 0; i1<nums.length - 3; i1++)
            for (int i2 = i1 + 1; i2 < nums.length - 2; i2++)
                for (int i3 = i2 + 1; i3 <nums.length - 1; i3++)
                    for (int i4 = i3 + 1; i4 <nums.length; i4++)
                        if (nums[i1] + nums[i2] + nums[i3] == nums[i4])
                            res++;
        return res;
    }
}