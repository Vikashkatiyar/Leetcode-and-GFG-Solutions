class Solution {
    public int[] countVisitedNodes(List<Integer> edges) {
         int n = edges.size(), res[] = new int[n], j = 0;
        for (int i = 0; i < n; j = ++i) {
            Set<Integer> seen = new HashSet<>();
            Stack<Integer> s = new Stack<>();
            while (!seen.contains(j) && res[j] == 0) {
                seen.add(j);
                s.push(j);
                j = edges.get(j);
            }
            if (seen.contains(j)) { // hit the cycle
                int k = s.size() - s.indexOf(j);
                for (j = 0; j < k; ++j) {
                    res[s.pop()] = k;
                }
            }
            while (!s.isEmpty()) {
                j = s.pop();
                res[j] = res[edges.get(j)] + 1;
            }
        }
        return res;
    }
}