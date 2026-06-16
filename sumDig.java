import java.util.Scanner;

public class sumDig {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int ans = smd(a);
        System.out.println(ans);

    }
    static int smd(int a) {
        if(a < 9){
            return a;
        }
        return (a%10) + smd(a/10);
    }
}
