public class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        System.out.println("i = " + i);
        System.out.println("-i = " + (-i));

        try {
            System.out.printf("negateExact(%d) = %d%n", 10, Math.negateExact(10));
            System.out.printf("negateExact(%d) = %d%n", -10, Math.negateExact(-10));
            System.out.printf("negateExact(%d) = %d%n", i, Math.negateExact(i));
        } catch (ArithmeticException e) {
            // i를 long타입으로 형변환 다음에 negateExact(long a)를 호출
            System.out.printf("negateExact(%d)= %d%n", (long)i, Math.negateExact((long)i));
        }
    }
}
