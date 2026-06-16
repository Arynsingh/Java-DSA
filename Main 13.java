import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Bubblesort(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void Bubblesort(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped=false;//for counter iterarion sorted last elem
            for(int j = 1; j < arr.length - i; j++){//for each elem in arr other than i
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
        }


        }
//if no swap happens the array is already sorted
    }
}