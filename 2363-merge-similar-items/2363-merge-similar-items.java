class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] i : items1) {
            if (map.containsKey(i[0])) {
                map.put(i[0], map.get(i[0]) + i[1]);
            } else {
                map.put(i[0], i[1]);
            }
        }
        for (int[] i : items2) {
            if (map.containsKey(i[0])) {
                map.put(i[0], map.get(i[0]) + i[1]);
            } else {
                map.put(i[0], i[1]);
            }
        }
        List<List<Integer>> list = new ArrayList<>(map.keySet().size());
        for (Integer key : map.keySet()) {
            List<Integer> l = new ArrayList<>(2);
            l.add(key);
            l.add(map.get(key));
            list.add(l);
        }
        return list;
    }
}