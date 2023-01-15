class Solution {
    public static List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList();
        String main = folder[0] + "/";
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; i++){
            if(!(folder[i].contains(main) && folder[i].startsWith(main))) {
                ans.add(folder[i]);
                main = folder[i]+"/";
            }
        }
        return ans;
    }
}
