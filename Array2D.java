import java.util.Arrays;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[][];
        System.out.println(arr.length);//number of row
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                arr[a][b] = sc.nextInt();

            }
        }
//        for (int a = 0; a < arr.length; a++) {
//            for (int b = 0; b < arr[a].length; b++) {
//                System.out.print(arr[a][b]+" ");
//printing using for loop basic
//            }
//            System.out.println();
//        }
//        System.out.println(Arrays.deepToString(arr));// printing usind deepTostring
//        for(int[] a : arr){
//            System.out.println(Arrays.toString(a));
//        }//printing using advanced for loop

        for (int a = 0; a < arr.length; a++) {
            System.out.println(Arrays.toString(arr[a]));
        }//using only row cuz each row is a array itself

    }
}
