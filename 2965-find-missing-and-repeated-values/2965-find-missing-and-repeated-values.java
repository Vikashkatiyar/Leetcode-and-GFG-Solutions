class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] freq=new int[n*n+1];
        
        for(int[] row: grid){
            for(int num: row){
                freq[num]++;
            }
        }
        
        int rep=0,mis=0;
        for(int i=1;i<freq.length;i++){
            
            if(freq[i]==0){
                mis=i;
            }else if(freq[i]==2){
                rep=i;
            }
            
        }
        
        return new int[]{rep, mis};
        
    }
}