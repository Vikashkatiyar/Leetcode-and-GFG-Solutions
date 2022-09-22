class Solution {
    public double myPow(double x, int n) {
         return n>0?rec(x,n):1/rec(x,n);
    }
    public double rec(double x,int n){
        if(n==0){
            return 1.0;
        }
        double xnb2=rec(x,n/2);
        
        return n%2==0?xnb2*xnb2:xnb2*xnb2*x;
    }
}