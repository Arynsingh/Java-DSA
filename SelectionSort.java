import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int last = arr.length-1-i;
            int max = getmax(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getmax(int[] arr,int start,int end){
        int maxi = start;
        for(int i = start;i<=end;i++){
            if(arr[i]>arr[maxi]){
                maxi = i;

            }
        }
        return maxi;

    }
    static void swap(int[]arr,int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}