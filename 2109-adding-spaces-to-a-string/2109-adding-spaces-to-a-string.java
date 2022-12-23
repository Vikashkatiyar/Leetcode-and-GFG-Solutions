class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);

        int counter = 0;//inserted string length increase
        for (int space : spaces) {
            sb.insert(space+counter, ' ');
            counter++;
        }

        return sb.toString();
    }
}