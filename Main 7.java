import java.util.Scanner;
class main{
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean ans = isarmstrong(n);
//        System.out.println(ans);
        for(int i=100;i<1000;i++){
            if(isarmstrong(i)){
                System.out.println(i);
            }
        }


    }
    static boolean isarmstrong(int x){
        int original = x;
        int sum = 0;
        while(x>0){
            int rem = x%10;
            sum += rem*rem*rem;
            x = x/10;
        }
        return sum==original;

    }
}
