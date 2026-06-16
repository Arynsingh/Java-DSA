import java.util.*;
public class MaxinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the elements in the array are\n" + Arrays.toString(arr));
        System.out.println("Maximum number of element:"+ Max(arr));

    }
    static int Max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}
