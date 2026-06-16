public class Main {
   public static void main() {
        message();

    }
    static void message() {
        System.out.println("Hello World!");//say we need to print 5 times without changing function
        message1();
    }
    static void message1() {
        System.out.println("Hello World!");
        message2();
    }
    static void message2() {
        System.out.println("Hello World!");
        message3();
    }
    static void message3() {
       System.out.println("Hello World!");

    }
}