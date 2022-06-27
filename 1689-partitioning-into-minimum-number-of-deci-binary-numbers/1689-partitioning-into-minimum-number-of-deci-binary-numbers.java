class Solution {
    public int minPartitions(String n) {
        // for (int i = 9; i >0; i--) {
        //     if(n.contains(String.valueOf(i)))
        //         return i;
        // }
        // return 0;
        
        int ans=0;
        for(char ch:n.toCharArray())
            ans=Math.max(ans,ch-'0');
        
        return ans;
    }
}