class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b= (long)Math.sqrt(c);
        while(a<=b){
            long mid=a*a+b*b;
            if(mid==c){
                return true;
            }
            else if(mid > c){
                b--;
            }
            else{
                a++;
            }
        }
        return false;
    }
}

