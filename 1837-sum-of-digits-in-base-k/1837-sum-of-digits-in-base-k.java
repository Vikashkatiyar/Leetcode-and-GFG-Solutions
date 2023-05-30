class Solution {
    public int sumBase(int n, int b) {
         int sum=0;
        while(n!=0){
            sum+=(n%b);
            n=n/b;
        }
        return sum;
    }
}