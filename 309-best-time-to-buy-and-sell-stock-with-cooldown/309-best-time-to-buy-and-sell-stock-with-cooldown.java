class Solution {
    public int maxProfit(int[] arr) {
        int obsp=-arr[0];
       int ossp=0;
       int ocsp=0;

       for(int i=1;i<arr.length;i++){
           int nbsp=0;
           int nssp=0;
           int ncsp=0;
//for bsp
           if(ocsp-arr[i]>obsp){
               nbsp=ocsp-arr[i];
           }else{
               nbsp=obsp;
           }

           //for ssp

           if(obsp+arr[i]>ossp){
               nssp=obsp+arr[i];
           }else{
               nssp=ossp;
           }

           //for csp

           if(ossp>ocsp){
               ncsp=ossp;
           }else{
               ncsp=ocsp;
           }

           obsp=nbsp;
           ossp=nssp;
           ocsp=ncsp;
       }
        return ossp;
    }
}