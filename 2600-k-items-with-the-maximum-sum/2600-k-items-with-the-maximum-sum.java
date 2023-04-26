class Solution {
    //Jai Bhole
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ans=0;
        if(k<=numOnes+numZeros){
            ans=Math.min(k,numOnes);
        }else {
            int negSum=k-(numOnes+numZeros);
            ans=numOnes-negSum;
        }
        return ans;
    }
}