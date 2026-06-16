import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        while(n!=0) {
            int x = n % 10;
            if (x > max) {
                max = x;

            }
            n = n / 10;
        }
        System.out.println(max);
    }
}
