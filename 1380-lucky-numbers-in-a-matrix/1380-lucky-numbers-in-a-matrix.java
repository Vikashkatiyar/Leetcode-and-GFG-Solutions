class Solution {
    public List<Integer> luckyNumbers (int[][] arr) {
        List<Integer> ans=new ArrayList<>();
        
        
        for(int i=0;i<arr[0].length;i++){
            int max=Integer.MIN_VALUE,r=0;  //finding max in ith col and storing its row no.
            for(int j=0;j<arr.length;j++){
                if(max<arr[j][i]) {
                    max=arr[j][i];  r=j;
                }
            }
            
            
            
            int min=Integer.MAX_VALUE;  // finding min in rth row
          for(int j=0;j<arr[0].length;j++){
                  if(min>arr[r][j])  min=arr[r][j];
            } 
            if(max==min) ans.add(max);  //comparing and adding to answer
        }
        return ans;
    }
}