class Solution {
    //Jai Baba Bhole
    public boolean isPrime(int num){
        if(num==1){
            return false;
        }
        
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean primeSubOperation(int[] nums) {
        
        int p=0;
        for(int x:nums){
            
            if(x<=p){  //if value is less than old value return false
                return false;
            }
            
            int prime=x-p-1; //find smallest possible prime number
            
            while(prime>0 && isPrime(prime)==false){
                prime--;
            }
            
            if(prime==0){
                p=x;
            }else {
                p=x-prime;
            }
        }
        return true;
    }
}