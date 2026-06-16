public class Numbereg {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        //print first number ; 1 2 3 4 5
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    //function body is changiing here so special case
    static void print5(int n){
        System.out.println(n);
    }
}
//here you can see we are doing the same thing again and again what if we have to go till 1 million
// now if you see pattern we are calling function and in function calling once again n + 1 times
// we can function it self with n + 1;
// example numeg2