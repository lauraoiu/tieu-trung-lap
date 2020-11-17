package laptt.utilities;

import java.util.Scanner;

public class MathUtilities {

    public static final double PI = 3.1415;

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("0 <= n <= 20");
        }

        long result = 1;

        if (n != 0 && n != 1) {
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int n = scanner.nextInt();

            try {
                System.out.println(n +"! = " + MathUtilities.getFactorial(n));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        //expected: 120 (actual)
    }

    //Test Driven Development
    //UAT: User Acceptance Test
}
