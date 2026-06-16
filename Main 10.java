import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements in array: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the element to be searched: ");
        int search = sc.nextInt();
        int ans = searchx(arr,search);
        System.out.println("Element found at index: "+ans);
    }
    static int searchx(int[] arr,int search){
        if(arr.length == 0){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
            int elem = arr[i];
            if(elem == search){
                return i;
            }
        }
        return -1;
    }
}