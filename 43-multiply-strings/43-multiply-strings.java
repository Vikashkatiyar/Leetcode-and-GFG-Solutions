import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger p,q;
        p=new BigInteger(num1);
        q=new BigInteger(num2);
        BigInteger res=p.multiply(q);
        return res.toString();
    }
}