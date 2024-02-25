package Timus;

//FindTheMissingLetter

public class codewars6 {
    public static char findMissingLetter(char[] array) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        abc = abc + abc.toUpperCase();
        int i0 = abc.indexOf(array[0]);
        for (int i = 0; i < array.length; i++) {
            if (abc.charAt(i0 + i) != array[i])
                return (char) ((int) array[i] - 1);
        }
        return ' ';
    }
}
