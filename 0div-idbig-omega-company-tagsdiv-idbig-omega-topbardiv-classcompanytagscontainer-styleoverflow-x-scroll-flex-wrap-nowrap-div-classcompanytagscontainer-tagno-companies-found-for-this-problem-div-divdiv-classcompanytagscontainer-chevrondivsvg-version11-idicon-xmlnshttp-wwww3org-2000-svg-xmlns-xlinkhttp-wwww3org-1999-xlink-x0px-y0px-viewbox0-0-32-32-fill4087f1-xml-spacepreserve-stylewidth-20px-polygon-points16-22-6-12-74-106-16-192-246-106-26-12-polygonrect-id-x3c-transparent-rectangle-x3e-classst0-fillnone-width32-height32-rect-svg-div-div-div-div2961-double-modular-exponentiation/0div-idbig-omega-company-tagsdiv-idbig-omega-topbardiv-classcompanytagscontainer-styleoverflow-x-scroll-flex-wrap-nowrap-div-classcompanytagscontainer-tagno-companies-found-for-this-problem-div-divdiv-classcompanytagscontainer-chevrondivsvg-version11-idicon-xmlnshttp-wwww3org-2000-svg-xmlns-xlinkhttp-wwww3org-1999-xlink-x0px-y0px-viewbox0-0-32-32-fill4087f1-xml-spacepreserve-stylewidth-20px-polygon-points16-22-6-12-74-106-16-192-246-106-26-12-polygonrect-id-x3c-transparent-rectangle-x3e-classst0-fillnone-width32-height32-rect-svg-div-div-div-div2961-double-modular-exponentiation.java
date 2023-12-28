class Solution {
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < variables.length; ++i) {
            int ai = variables[i][0];
            int bi = variables[i][1];
            int ci = variables[i][2];
            int mi = variables[i][3];
            int base = 1;
            for (int j = 0; j < bi; ++j) {
                base = (base * ai) % 10;
            }
            int formulaResult = 1;
            for (int j = 0; j < ci; ++j) {
                formulaResult = (formulaResult * base) % mi;
            }
            if (formulaResult == target) {
                result.add(i);
            }
        }
        return result;
    }
}