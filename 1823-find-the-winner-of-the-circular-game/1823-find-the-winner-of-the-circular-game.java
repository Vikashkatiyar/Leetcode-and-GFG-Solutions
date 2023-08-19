class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1){
            return 1;
        }
        int x=findTheWinner(n-1,k);
        int y=(x+k-1)%n+1; //start 1 to n
        // int y=(x+k)%n //for start 0 to n-1
        return y;
    }
}