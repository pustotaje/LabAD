package Lab06;

import static Lab06.ex07.ex07tt;

public class ex07t {
    public static void main(String[] args) {
        char[] characters = {'H', 'e', 'l', 'l', 'o'};
        int[] codes = ex07tt(characters);

        System.out.print("Character codes: ");
        for (int code : codes) {
            System.out.print(code + " ");
        }
    }
}
