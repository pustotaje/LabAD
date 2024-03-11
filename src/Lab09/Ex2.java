package Lab09;

public class Ex2 {

    public static class Recursion1 {
        public static void m(int x) {
            if ((2 * x + 1) < 20) {
                m(2 * x + 1);
            }
            System.out.println("x=" + x);
        }

        public static void main(String[] args) {
            Recursion1.m(1);
        }
    }
}
