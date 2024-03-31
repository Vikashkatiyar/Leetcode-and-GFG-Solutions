class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=calculateSum(x);
        if(x%sum==0){
            return sum;
        }
        
        return -1;
    }
    
    public int calculateSum(int num){
        int sum=0;
        
        while(num!=0){
            sum+=num%10;
            num=num/10;
            
        }
        return sum;
    }
}