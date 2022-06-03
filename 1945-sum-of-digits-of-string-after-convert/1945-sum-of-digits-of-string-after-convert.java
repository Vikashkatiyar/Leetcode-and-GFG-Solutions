class Solution {
    public int getLucky(String s, int k) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=getSum(s.charAt(i)-96);
        }
        
        if(k==1){
            return sum;
        }
        
        int num=sum;
        sum=0;
        for(int i=2;i<=k;i++){
            sum=getSum(num);
            num=sum;
        }
        return sum;
    }
    public static int getSum(int n)
    {   
        int sum = 0;
         
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
     
    return sum;
    }
}