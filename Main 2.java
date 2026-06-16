import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a  = 5;
        fn(a);
        fnRev(a);
        fnboth(a);

    }
    static void fn(int a){
        if(a ==0){
            return;
        }
        System.out.println(a);
        fn(a-1);
    }
    static void fnRev(int n){
        if(n==0){
            return ;
        }
        fnRev(n-1);
        System.out.println(n);
}
    static void fnboth(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fnboth(n-1);
        System.out.println(n);
    }



}

