import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Fibonaccifun(n);
        System.out.println(ans);
    }
    static int Fibonaccifun(int n) {
        if(n<2){
            return n;
        }


        return Fibonaccifun(n-1) + Fibonaccifun(n-2);
    }

}
