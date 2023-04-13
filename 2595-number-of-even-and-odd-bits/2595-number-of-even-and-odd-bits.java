class Solution {
    public int[] evenOddBit(int n) {
        String str=Integer.toBinaryString(n);
        String binary=new StringBuilder(str).reverse().toString();
        int even=0;
        int odd=0;
        for(int i=0;i<binary.length();i++){
            char ch=binary.charAt(i);
            if(ch=='1'){
                if(i%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        return new int[]{even,odd};
    }
}