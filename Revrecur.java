import java.util.Scanner;
public class Revrecur {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        rev(n);
        System.out.println(sum);

    }
    static int sum = 0;
    static void rev(int n){
        if(n ==0){
            return ;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        rev(n/10);

    }
}
