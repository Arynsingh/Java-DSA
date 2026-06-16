import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        builder.append(str);
        String x = builder.reverse();
        if(builder == x){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}