import java.math.BigInteger;

public class BigIntegerEx {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d!=%s%n", i, calcFactorial(i));
            try {
                Thread.sleep(300);  // 0.3초의 지연
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static String calcFactorial(int n) {
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else // return n * factorial(n-1);
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
