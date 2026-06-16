//order agnostic binarysearch
import java.util.*;
public class OrderAgBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the element to be searched: ");
        int target = in.nextInt();
        int ans = Binarysearch(arr, target);
        System.out.println(ans);


    }

    static int Binarysearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean Ascending = nums[start] < nums[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if (Ascending){
                if(target<nums[mid]){
                    end = mid -1 ;
                }else if(target>nums[mid]){
                    start = mid + 1;
                }
            }else{
                if(target>nums[mid]){
                    end = mid -1 ;
                }else if(target<nums[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;


    }
}

