public class Numeg2 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(5);// without this it will be 1 2 3 4

            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
