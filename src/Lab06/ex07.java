package Lab06;

public class ex07 {
    public static int[] ex07tt(char[] array) {
        int[] codes = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            codes[i] = (int) array[i];
        }

        return codes;
    }
}
