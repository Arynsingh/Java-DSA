import java.util.Scanner;
import java.util.Arrays;
public class SwapArray {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter the index of number you want to swap");
        int index = sc.nextInt();
        System.out.println("Enter the index2 for swapping: ");
        int index2 = sc.nextInt();
        swap(arr, index, index2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}

