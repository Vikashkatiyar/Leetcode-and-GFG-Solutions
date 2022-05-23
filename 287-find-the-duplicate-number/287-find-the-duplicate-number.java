class Solution {
    public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int len = nums.length;
//         for (int i = 1; i < len; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 return nums[i];
//             }
//         }

//         return len;
        
        //method 2
//         int len = nums.length;
//         for (int i = 0; i < len; i++) {
//             for (int j = i + 1; j < len; j++) {
//                 if (nums[i] == nums[j]) {
//                     return nums[i];
//                 }
//             }
//         }

//         return len;
        
        
        // method 3
        
        int len = nums.length;
        int[] cnt = new int[len + 1];
        for (int i = 0; i < len; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] > 1) {
                return nums[i];
            }
        }

        return len;
    }
}