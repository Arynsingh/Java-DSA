import java.util.*;
public class ReverseofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Reversed Array: ");
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] num){
        int start = 0;
        int end = num.length - 1;
        while(start<end){
            swap(num , start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] x,int a,int b){
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }

}

//idea of reversing in list we can swap every element from start to end
