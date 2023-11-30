class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] bucket = new int[26];
            for (int j = i; j < s.length(); j++) {
                bucket[s.charAt(j) - 'a']++; // a,aa,aab,aaabc,aabcd etc
                ans += beauty(bucket);
            }
        }
        
        return ans;
    }
    public int beauty(int[] bucket) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 26; i++) {
            if (bucket[i] == 0) continue;
            min = Math.min(min, bucket[i]);
            max = Math.max(max, bucket[i]);
        }
        return max - min;
    }
}