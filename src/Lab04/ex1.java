package Lab04;

public class ex1 {
    public static void main(String[] args) {
        int width = 23; // ширина
        int height = 11; // высота

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
