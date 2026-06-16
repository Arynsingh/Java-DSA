import java.util.Scanner;

public class Buswindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (x > n * 9) {
                System.out.println("Invalid seats");
            } else if (x % n == 0 || x % n == 1) {
                System.out.println("Window Seat");
            } else {
                System.out.println("Not a window seat");
            }
        }
    }
}