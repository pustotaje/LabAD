package Timus;

//BouncingBalls

public class codewars4 {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) return -1;
        double bounceHeight;
        bounceHeight = h * bounce;
        int count = 1;
        while (bounceHeight > window) {
            count += 2;
            bounceHeight = bounceHeight * bounce;
        }
        return count;
    }
}
