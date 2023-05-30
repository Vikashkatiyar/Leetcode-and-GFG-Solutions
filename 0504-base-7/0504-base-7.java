class Solution {
    //Jai Baba Bhole
    public String convertToBase7(int num) {
        long res=0;
        long power=1;
        int B=7;
        
        
        while(num!=0){
            int remainder=num%B;
            res=res+power*remainder;
            num=num/B;
            power=power*10;
        }
        
        return String.valueOf(res);
    }
}