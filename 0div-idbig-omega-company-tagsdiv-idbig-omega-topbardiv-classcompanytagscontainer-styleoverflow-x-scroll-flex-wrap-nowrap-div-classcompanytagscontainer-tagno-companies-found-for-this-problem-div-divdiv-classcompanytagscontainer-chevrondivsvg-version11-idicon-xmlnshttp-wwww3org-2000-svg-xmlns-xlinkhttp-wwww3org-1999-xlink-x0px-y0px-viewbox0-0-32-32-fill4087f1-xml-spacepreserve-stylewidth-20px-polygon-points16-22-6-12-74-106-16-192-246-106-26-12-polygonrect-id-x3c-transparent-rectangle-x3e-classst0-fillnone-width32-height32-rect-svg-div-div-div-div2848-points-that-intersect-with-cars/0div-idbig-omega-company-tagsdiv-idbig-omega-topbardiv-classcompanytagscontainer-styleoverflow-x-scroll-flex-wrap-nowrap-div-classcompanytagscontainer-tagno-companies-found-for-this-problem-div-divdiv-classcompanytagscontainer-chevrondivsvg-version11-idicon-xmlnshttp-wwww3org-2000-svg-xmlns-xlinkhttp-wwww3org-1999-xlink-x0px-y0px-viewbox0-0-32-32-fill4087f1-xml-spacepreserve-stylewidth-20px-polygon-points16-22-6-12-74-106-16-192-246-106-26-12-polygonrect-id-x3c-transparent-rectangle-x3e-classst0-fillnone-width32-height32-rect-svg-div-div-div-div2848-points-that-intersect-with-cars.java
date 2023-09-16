class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] temp=new int[100];
        
        for(List<Integer> num:nums){
            int start=num.get(0);
            int end=num.get(1);
            temp[start-1]++;
            
            if(end<100){
                temp[end]--;
            }
        }
        
        int currSum=0;
        int coveredPoint=0;
        
        for(int i=1;i<=100;i++){
            currSum+=temp[i-1];
            if(currSum>0){
                coveredPoint++;
            }
        }
        
        return coveredPoint;
    }
}