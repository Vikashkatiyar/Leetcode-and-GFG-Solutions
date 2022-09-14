class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
        Arrays.sort(nums2); // sort nums2[] to avoid duplicates
        
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (i >= 1 && nums2[i] == nums2[i - 1]) {
                continue;
            }
            if ((Arrays.binarySearch(nums1, nums2[i])>=0?true:false) == true) {
                res.add(nums2[i]);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

}