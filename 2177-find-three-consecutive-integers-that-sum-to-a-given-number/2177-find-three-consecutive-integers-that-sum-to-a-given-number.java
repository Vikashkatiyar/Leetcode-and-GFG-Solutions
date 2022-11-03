class Solution {
    public long[] sumOfThree(long num) {
        if(num%3==0){
            long newNum=num/3;
            return new long[]{newNum-1,newNum,newNum+1};
        }
        return new long[]{};
        
    }
}