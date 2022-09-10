class Solution {
    //TC: O(nlog(n))
    public int numberOfWeakCharacters(int[][] prop) {
        Arrays.sort(prop,(a,b)->b[0]==a[0]?b[1]-a[1]:a[0]-b[0]);
        
        int ans=0;
        int max=0;
        for(int i=prop.length-1;i>=0;i--){
            if(max > prop[i][1]){
                ans++;
            }
            max=Math.max(max,prop[i][1]);
        }
        
        return ans;
    }
}