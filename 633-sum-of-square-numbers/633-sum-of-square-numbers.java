class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (long) Math.sqrt(c);
        // System.out.println(r);
        while(l <= r) {
            long sum = l * l + r * r;
            if (sum == c) {
                return true;
            }
            else if (sum > c) {
                r--;
            } else {
                l++;
            }
        }
        return false;
    }
}

// long a=0;
//         long b= (long)Math.sqrt(c);
//         while(a<=b){
//             long mid=a*a+b*b;
//             if(mid==c){
//                 return true;
//             }
//             else if(mid < c){
//                 a--;
//             }
//             else{
//                 b++;
//             }
//         }
//         return false;