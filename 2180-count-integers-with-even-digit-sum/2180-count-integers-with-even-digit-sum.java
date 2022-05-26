class Solution {
    public int countEven(int num) {
        String s=""+num;
        int sum=0;
        for(char c:s.toCharArray()){
            sum+=(c-'0');
        }
        if(sum%2==0){
            return num/2;
        }
        else{
            return (num-1)/2;
        }
    }
}


//Brute forse app->
// public int countEven(int num) {
//         int i=0;
//         int count=0;
//         while(i<num){
//             if(sumOfDigit(i)%2==0){
//                 count++;
//             }
//             i++;
//         }
//         return count;
//     }
    
//     private int sumOfDigit(int n){
//         String s=""+n;
//         int sum=0;
//         for(char c:s.toCharArray()){
//             sum+=(c-'0');
//         }
//         return sum;
//     }