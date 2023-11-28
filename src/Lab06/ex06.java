package Lab06;
import java.util.Arrays;
public class ex06 {
    public static int[] takeFirstElements(int[] array, int count) {
        if (count >= array.length) {
            return Arrays.copyOf(array, array.length);
        } else {
            return Arrays.copyOfRange(array, 0, count);
        }
    }
}
