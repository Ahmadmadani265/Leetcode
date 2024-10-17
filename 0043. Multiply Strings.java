import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
    BigInteger b=new BigInteger(num1);
    BigInteger a=new BigInteger(num2);
    BigInteger res=b.multiply(a);
     return res+"";
    }
}
