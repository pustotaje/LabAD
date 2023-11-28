package Lab06;

public class ex04 {
    public static int doubleFactorial(int n) {
        if (n <= 0) {
            return 1;
        }
        int result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }
}
