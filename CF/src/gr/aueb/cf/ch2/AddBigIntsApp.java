package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class AddBigIntsApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("32155843585412258631");
        BigInteger bigNum2 = new BigInteger("21558421231284523215");
        BigInteger result = bigNum1.add(bigNum2);

        System.out.printf("%,d", result);

    }
}
