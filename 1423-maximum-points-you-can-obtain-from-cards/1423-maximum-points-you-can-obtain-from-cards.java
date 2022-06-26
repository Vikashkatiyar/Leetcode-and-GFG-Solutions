class Solution {
    //sliding Window Approach
    //TC:O(k)
    //SC:O(1)
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+cardPoints[i];
        }
        int len=cardPoints.length;
        int maxSum=sum;
        
        int i=0;
        while(i<k){
            sum=sum-cardPoints[k-1-i]+cardPoints[len-1-i];
            maxSum=Math.max(maxSum,sum);
            i++;
        }
        
        return maxSum;
    }
}